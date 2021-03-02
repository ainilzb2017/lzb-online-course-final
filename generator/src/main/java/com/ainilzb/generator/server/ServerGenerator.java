package com.ainilzb.generator.server;

/**
 * @ClassName: ServerGenerator
 * @Description:
 * @Author 李泽波
 * @Date 2021/3/2
 * @Version 1.0
 */
import com.ainilzb.generator.util.FreemarkerUtil;
import freemarker.template.TemplateException;

import java.io.IOException;

public class ServerGenerator {
    static String toPath = "generator\\src\\main\\java\\com\\ainilzb\\generator\\test\\";

    public static void main(String[] args) throws IOException, TemplateException {
        FreemarkerUtil.initConfig("test.ftl");
        FreemarkerUtil.generator(toPath + "Test.java");
    }
}
