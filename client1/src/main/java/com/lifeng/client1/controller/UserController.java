package com.lifeng.client1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制类
 *
 * @author fengli
 * @version 1.0
 * @date 2020/12/14
 */
@RestController
public class UserController {

    @GetMapping("/findByid/{id}")
    public String findById(@PathVariable String id){
        System.out.println("id="+id);
        return "请求成功"+id;
    }

}
