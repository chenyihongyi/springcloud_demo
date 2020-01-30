package com.springcloud;

import com.springcloud.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: Elvis
 * @Description:
 * @Date: 2020/1/29 3:03
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name="SPRINGCLOUD-DEPT",configuration= MySelfRule.class)
public class DeptConsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}
