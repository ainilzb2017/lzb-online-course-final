package com.ainilzb.business.controller.admin;

import com.ainilzb.server.dto.ChapterDto;
import com.ainilzb.server.dto.PageDto;
import com.ainilzb.server.dto.ResponseDto;
import com.ainilzb.server.service.ChapterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: TestController
 * @Description:
 * @Author 李泽波
 * @Date 2021/2/23
 * @Version 1.0
 */

@RestController
@RequestMapping("/admin/chapter")
@Slf4j
public class ChapterController {

    @Resource
    private ChapterService chapterService;

    @RequestMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        log.info("pageDto: {}", pageDto);
        ResponseDto responseDto = new ResponseDto();
        chapterService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    @RequestMapping("/save")
    public ResponseDto save(@RequestBody ChapterDto chapterDto) {
        log.info("chapterDto: {}", chapterDto);
        ResponseDto responseDto = new ResponseDto();
        chapterService.save(chapterDto);
        responseDto.setContent(chapterDto);
        return responseDto;
    }
}
