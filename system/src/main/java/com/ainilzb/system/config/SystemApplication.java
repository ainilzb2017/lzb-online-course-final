package com.ainilzb.system.config;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableEurekaClient
@Slf4j
@ComponentScan("com.ainilzb")
@MapperScan("com.ainilzb.server.mapper")
public class SystemApplication {


	public static void main(String[] args) {
		//SpringApplication.run(SystemApplication.class, args);

		SpringApplication app = new SpringApplication(SystemApplication.class);
		Environment env = app.run(args).getEnvironment();
		log.info("启动成功！！");
		log.info("System地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
	}

}
