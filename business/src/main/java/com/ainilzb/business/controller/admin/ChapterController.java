package com.ainilzb.business.controller.admin;

import com.ainilzb.server.dto.ChapterDto;
import com.ainilzb.server.service.ChapterService;
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
public class ChapterController {

    @Resource
    private ChapterService chapterService;

    @RequestMapping("/list")
    public List<ChapterDto> list() {
        return chapterService.list();
    }
}
