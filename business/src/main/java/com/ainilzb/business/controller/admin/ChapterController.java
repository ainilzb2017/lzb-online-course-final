package com.ainilzb.business.controller.admin;

import com.ainilzb.server.dto.ChapterDto;
import com.ainilzb.server.dto.PageDto;
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
    public PageDto list(@RequestBody PageDto pageDto) {
        log.info("pageDto: {}", pageDto);
        chapterService.list(pageDto);
        return pageDto;
    }
}
