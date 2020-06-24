package com.esms.controller;

import com.esms.service.IImportDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 考勤表和补发金额表数据导入
 **/
@Controller
public class ImportDataController {
    @Autowired
    private IImportDataService importDataService;
    /**
     * 跳转到importAttendanceTeable
     * @return
     */
    @RequestMapping("toImportAttendance.do")
    public String toImportAttendance(){
        return "admin/importData/importAttendanceTable.jsp";
    }
    /**
     * 跳转到importReissueTable
     * @return
     */
    @RequestMapping("toImportReissue.do")
    public String toImportReissue(){
        return "admin/importData/importReissueTable.jsp";
    }

    /**
     *上传月出勤表
     * @param excel 考勤表文件
     * @return
     */
    @RequestMapping("/importAttendance.do")
    @ResponseBody
    public Map<String,String> importAttendanceTable(@RequestParam("file") MultipartFile excel) throws Exception{
        Map<String,String> map = new HashMap<String, String>();
        if (!excel.isEmpty()) {
            String result = importDataService.insertMATable(excel);
            map.put("result",result);
            return map;
            /*if (importDataService.insertMATable(excel)) {
                //return "admin/importData/success.jsp";
                map.put("result","导入成功");
                return map;
            }
            else{
                map.put("result","只能导入Microsoft Excel 97-2003 工作表 (.xls)，请检查文件是否正确");
                return map;
            }*/
        } else {
            map.put("result","导入错误，请重新选择文件");
            return map;
        }
    }

    /**
     *
     * @param excel 补发金额表excel
     * @return
     */
    @RequestMapping("/importReissue.do")
    @ResponseBody
    public Map<String,String> importReissueTable(@RequestParam("file") MultipartFile excel) throws Exception{
        Map<String,String> map = new HashMap<String, String>();
        if (!excel.isEmpty()) {
            String result = importDataService.insertReissueTable(excel);
            map.put("result",result);
            return map;
        }
        else {
            map.put("result","导入的文件不存在，请重新选择文件");
            return map;
        }
    }
}
