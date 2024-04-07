package com.itheima.controller;

import com.itheima.pojo.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController

public class FileUploadController {
    @PostMapping("/upload")
    public Result<String> upload(MultipartFile file) throws IOException {
//把文件的內容存儲到本地瓷盤
        String originalFilename = file.getOriginalFilename();
//        保證文件的名字是依樣的 從而防止文件覆蓋
        String filename = UUID.randomUUID().toString()+originalFilename.substring(originalFilename.lastIndexOf("."));
        file.transferTo(new File("C:\\Users\\jim09\\Desktop\\files\\"+filename));
        return Result.success("url放問地址");
    }
}
