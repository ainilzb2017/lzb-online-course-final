package com.ainilzb.server.service;

import com.ainilzb.server.domain.Chapter;
import com.ainilzb.server.domain.ChapterExample;
import com.ainilzb.server.dto.ChapterDto;
import com.ainilzb.server.mapper.ChapterMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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

    public List<ChapterDto> list(){

        //ChapterExample相当于where
        //排序
        ChapterExample chapterExample = new ChapterExample();
        chapterExample.setOrderByClause("id desc");

//        ChapterExample chapterExample = new ChapterExample();
//        //andIdEqualTo可以看得出id=1
//        chapterExample.createCriteria().andIdEqualTo("00000010");

        List<Chapter> chapterList =  chapterMapper.selectByExample(chapterExample);
        List<ChapterDto> chapterDtoList = new ArrayList<ChapterDto>();
        for (int i = 0; i < chapterList.size(); i++) {
            Chapter chapter = chapterList.get(i);
            ChapterDto chapterDto = new ChapterDto();
            BeanUtils.copyProperties(chapter,chapterDto);
            chapterDtoList.add(chapterDto);
        }
        return chapterDtoList;
    }
}
