package com.ainilzb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Description:
 * @Author 李泽波
 * @Date 2021/2/23
 * @Version 1.0
 */

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "success";
    }
}
