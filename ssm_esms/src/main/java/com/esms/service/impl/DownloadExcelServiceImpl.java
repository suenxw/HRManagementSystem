package com.esms.service.impl;

import com.esms.mapper.SalaryMapper;
import com.esms.exception.CustomException;
import com.esms.dao.Salary;
import com.esms.service.IDownloadExcelService;
import com.esms.utils.JXLUtils;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class DownloadExcelServiceImpl implements IDownloadExcelService{
    @Autowired
    private SalaryMapper salaryMapper;
    @Override
    public void getSalaryExcel(HttpServletRequest request, HttpServletResponse response,String eAccount,Integer dId,String sTime)  throws Exception{
       // response.setCharacterEncoding("utf-8");
        //response.setHeader("Content-Disposition", "text/html; charset=utf-8;attachment; filename=salary.xls");
        // 时间前缀
        String dateStr = "";
        DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        dateStr = format.format(new Date());
        String excelName = "工资表"+dateStr+".xls";
            //WritableWorkbook writableWorkbook = ExcelUtils.createTemplate(response.getOutputStream());

        WritableWorkbook writableWorkbook = null;
        Map map = new HashMap<String,Object>();
        map.put("eAccount",eAccount);
        map.put("dId",dId);
        map.put("sTime",sTime);
        List<Salary> salaries = salaryMapper.selectByEaccountDIdDate(map);
        try {
            response.setHeader("Content-Disposition", "attachment;filename=" + new String(excelName.getBytes("gbk"),"ISO-8859-1"));

            writableWorkbook = JXLUtils.createSalaryExcel(response.getOutputStream(),salaries);
            writableWorkbook.write();
            writableWorkbook.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new CustomException("下载失败");
        } catch (WriteException e) {
            e.printStackTrace();
            throw new CustomException("下载失败");
        }
        }


}
