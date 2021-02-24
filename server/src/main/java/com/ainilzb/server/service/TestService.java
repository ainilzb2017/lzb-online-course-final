package com.ainilzb.server.service;

import com.ainilzb.server.domain.Test;
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
        return testMapper.list();
    }
}
