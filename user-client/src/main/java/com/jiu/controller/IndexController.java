package com.jiu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jiu.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 */
@RestController
public class IndexController {

    /**
     * 当有多个实现时
     * 不指定group  userService无法注入。。为null
     * group为*  输出lender
     */
    @Reference(version = "1.0", group = "user")
    UserService userService;

    @RequestMapping(value = "/index")
    public String index() {
        return userService.say();
    }

}
