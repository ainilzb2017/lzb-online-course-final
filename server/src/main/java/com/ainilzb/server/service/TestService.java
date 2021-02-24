package com.ainilzb.server.service;

import com.ainilzb.server.domain.Test;
import com.ainilzb.server.domain.TestExample;
import com.ainilzb.server.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: TestService
 * @Description:
 * @Author 李泽波
 * @Date 2021/2/23
 * @Version 1.0
 */
@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list(){

        //TestExample相当于where
        //排序
//        TestExample testExample = new TestExample();
//        testExample.setOrderByClause("id desc");

        TestExample testExample = new TestExample();
        //andIdEqualTo可以看得出id=1
        testExample.createCriteria().andIdEqualTo("1");


        return testMapper.selectByExample(testExample);
    }
}
