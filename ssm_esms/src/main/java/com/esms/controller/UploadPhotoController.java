package com.esms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description：
 * @Version: 1.0
 */
@Controller
public class UploadPhotoController {
    @RequestMapping("uploadPhoto.do")
    @ResponseBody
    public Object updateHeadPhoto(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 文件后缀
        String prefix = "";
        // 时间前缀
        String dateStr = "";

        // 随机数前缀
        double index = 1000 * (Math.random());
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            if (file != null) {

                String originalName = file.getOriginalFilename();
                System.out.println("原文件名为："+originalName);
                prefix = originalName.substring(originalName.lastIndexOf(".") + 1);
                System.out.println("文件格式为"+prefix);

                dateStr = format.format(new Date());
                String filepath = request.getServletContext().getRealPath("/img/head/") + dateStr + index + "." + prefix;
//                System.out.println("request.getServletContext().getRealPath:----"+request.getServletContext().getRealPath("/img/head/"));

                String filepath2 = "/Users/suen/IdeaProjects/ssm_esms/src/main/webapp/img/head/" + dateStr + index + "." + prefix;
                //   /Users/suen/IdeaProjects/ssm_esms/src/main/webapp/img/head/

                filepath = filepath.replace("\\", "/");
                filepath2 = filepath2.replace("\\", "/");
                File files = new File(filepath);
                //打印查看上传路径
                System.out.println("tomcat下地址"+filepath);
                System.out.println("本地项目下地址"+filepath2);

                if (!files.getParentFile().exists()) {
                    files.getParentFile().mkdirs();
                    System.out.println("执行了files.getParentFile().mkdirs()");
                }
                try {
                    // 将获取到的附件file,transferTo写入到指定的位置(即:创建files时，指定的路径)
                    file.transferTo(files);
                    System.out.println("执行了file.transferTo(files);");
                } catch (IllegalStateException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

//                file.transferTo(files);

                try {
                    //保存上传 至本地项目
                    FileInputStream fileInput = new FileInputStream(filepath);
                    FileOutputStream out = new FileOutputStream(filepath2);
                    byte datas[] =new byte[1024*8];//创建搬运工具
                    int len=0;

                    while((len = fileInput.read(datas))!=-1)//循环读取数据
                    {
                        out.write(datas,0,len);
                    }
                    if (out != null) {
                        out.close();
//                        System.out.println("执行了out。close");
                    }
                    if (fileInput != null) {
                        fileInput.close();
//                        System.out.println("执行了fileInput。close");
                    }
                } catch (IOException e) {
                }


            }
        } catch (Exception e) {
        }

        Map<String, Object> map2 = new HashMap<String, Object>();
        Map<String, Object> map = new HashMap<String, Object>();
        // 返回上传后的图片地址 img/head/……jpg
        map2.put("src", "/ssm_esms/img/head/" + dateStr + index + "." + prefix);
        map.put("code", 0);
        map.put("msg", "");
        map.put("data", map2);
        return map;
    }
}
