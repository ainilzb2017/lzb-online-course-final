package com.ainilzb.server.service;

import com.ainilzb.server.domain.Chapter;
import com.ainilzb.server.domain.ChapterExample;
import com.ainilzb.server.mapper.ChapterMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: ChapterService
 * @Description:
 * @Author 李泽波
 * @Date 2021/2/23
 * @Version 1.0
 */
@Service
public class ChapterService {

    @Resource
    private ChapterMapper chapterMapper;

    public List<Chapter> list(){

        //ChapterExample相当于where
        //排序
//        ChapterExample chapterExample = new ChapterExample();
//        chapterExample.setOrderByClause("id desc");

        ChapterExample chapterExample = new ChapterExample();
        //andIdEqualTo可以看得出id=1
        chapterExample.createCriteria().andIdEqualTo("00000001");


        return chapterMapper.selectByExample(chapterExample);
    }
}
