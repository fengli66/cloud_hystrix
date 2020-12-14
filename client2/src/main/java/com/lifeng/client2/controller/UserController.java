package com.lifeng.client2.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 用户控制类
 *
 * @author fengli
 * @version 1.0
 * @date 2020/12/14
 */
@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findByid/{id}")
    @HystrixCommand(fallbackMethod = "fallbackInfo")
    public String findByid(@PathVariable String id) {
        System.out.println("id=" + id);
        String msg = this.restTemplate.getForObject("http://client1/findByid/" + id, String.class);
        return msg;
    }
    /**
     * 返回信息方法
     * @param id
     * @return
     */
    public String fallbackInfo(@PathVariable String id) {
        return "服务不可用，请稍后再试!";
    }
}
