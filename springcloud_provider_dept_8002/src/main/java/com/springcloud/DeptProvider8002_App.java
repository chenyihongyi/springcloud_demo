package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Elvis
 * @Description:
 * @Date: 2020/1/28 5:09
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后自动注册进eureka
@EnableDiscoveryClient //服务发现
public class DeptProvider8002_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_App.class, args);
    }
}
