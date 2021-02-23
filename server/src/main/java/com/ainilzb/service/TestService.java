package com.ainilzb.service;

import com.ainilzb.domain.Test;
import com.ainilzb.mapper.TestMapper;
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
        return testMapper.list();
    }
}
