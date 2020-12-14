package com.lifeng.cloud_hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka服务注册中心
 * @author fengli
 * @version 1.0
 * @date 2020/12/14
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudHystrixApplication.class, args);
    }

}
