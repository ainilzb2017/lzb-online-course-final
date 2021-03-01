package com.ainilzb.server.service;

import com.ainilzb.server.domain.Chapter;
import com.ainilzb.server.domain.ChapterExample;
import com.ainilzb.server.dto.ChapterDto;
import com.ainilzb.server.dto.PageDto;
import com.ainilzb.server.mapper.ChapterMapper;
import com.ainilzb.server.util.CopyUtil;
import com.ainilzb.server.util.UuidUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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

    public void list(PageDto pageDto){
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());

        //ChapterExample相当于where
        //排序
        ChapterExample chapterExample = new ChapterExample();
//        chapterExample.setOrderByClause("id asc");

//        ChapterExample chapterExample = new ChapterExample();
//        //andIdEqualTo可以看得出id=1
//        chapterExample.createCriteria().andIdEqualTo("00000010");

        List<Chapter> chapterList =  chapterMapper.selectByExample(chapterExample);
        //PageInfo是mybatis自己封装好的
        PageInfo<Chapter> pageInfo = new PageInfo<>(chapterList);
        pageDto.setTotal(pageInfo.getTotal());

//        List<ChapterDto> chapterDtoList = new ArrayList<ChapterDto>();
//        for (int i = 0; i < chapterList.size(); i++) {
//            Chapter chapter = chapterList.get(i);
//            ChapterDto chapterDto = new ChapterDto();
//            BeanUtils.copyProperties(chapter,chapterDto);
//            chapterDtoList.add(chapterDto);
//        }
        List<ChapterDto> chapterDtoList = CopyUtil.copyList(chapterList, ChapterDto.class);
        pageDto.setList(chapterDtoList);
    }

    public void save(ChapterDto chapterDto) {
        Chapter chapter = CopyUtil.copy(chapterDto, Chapter.class);
        if (StringUtils.isEmpty(chapterDto.getId())) {
            this.insert(chapter);
        } else {
            this.update(chapter);
        }
    }

    private void insert(Chapter chapter) {
        chapter.setId(UuidUtil.getShortUuid());
        chapterMapper.insert(chapter);
    }

    private void update(Chapter chapter) {
        chapterMapper.updateByPrimaryKey(chapter);
    }

    public void delete(String id) {
        chapterMapper.deleteByPrimaryKey(id);
    }
}
