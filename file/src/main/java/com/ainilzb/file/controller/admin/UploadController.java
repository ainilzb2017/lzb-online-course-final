package com.ainilzb.file.controller.admin;

import com.ainilzb.server.dto.ResponseDto;
import com.ainilzb.server.util.UuidUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RequestMapping("/admin")
@Slf4j
@RestController
public class UploadController {


    public static final String BUSINESS_NAME = "文件上传";

    @RequestMapping("/upload")
    public ResponseDto upload(@RequestParam MultipartFile file) throws IOException {
        log.info("上传文件开始：{}", file);
        log.info(file.getOriginalFilename());
        log.info(String.valueOf(file.getSize()));

        // 保存文件到本地
        String fileName = file.getOriginalFilename();
        String key = UuidUtil.getShortUuid();
        String fullPath = "D:/file/ainilzb/course/teacher/" + key + "-" + fileName;
        File dest = new File(fullPath);
        file.transferTo(dest);
        log.info(dest.getAbsolutePath());

        ResponseDto responseDto = new ResponseDto();
        return responseDto;
    }
}
