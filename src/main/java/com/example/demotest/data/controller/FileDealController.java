package com.example.demotest.data.controller;

import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
@CrossOrigin
@RestController
public class FileDealController {
    @RequestMapping(value = "/upload")
    @ResponseBody
    public String uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        assert fileName != null;
        int split = fileName.lastIndexOf(".");
        // 文件后缀，用于判断上传的文件是否是合法的
        String suffix = fileName.substring(split+1,fileName.length());
        String url = "";
        if("jpg".equals(suffix) || "jpeg".equals(suffix) || "png".equals(suffix)) {
            try {
                File path = new File(ResourceUtils.getURL("classpath:").getPath());
                File upload = new File(path.getAbsolutePath(), "upload/");
                if(!upload.exists()) {
                    upload.mkdirs();
                }
                String newName = System.currentTimeMillis() + "."+suffix;
                String homepath = "/home/upload/images";
                File savedFile = new File(upload + "/" + newName);
                file.transferTo(savedFile);
               // url = savedFile.getAbsolutePath();
                url="http://localhost:8080/upload/"+newName;
                System.out.println("图片上传完毕，存储地址为："+ url);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else {
            //错误的类型，返回错误提示

        }
        return url;
    }

}
