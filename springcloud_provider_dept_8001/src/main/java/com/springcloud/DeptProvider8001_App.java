package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Elvis
 * @Description:
 * @Date: 2020/1/28 5:09
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后自动注册进eureka
public class DeptProvider8001_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_App.class, args);
    }
}
