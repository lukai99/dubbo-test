package com.jiu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jiu.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 */
@RestController
public class IndexController {

    @Reference(version = "1.0")
    UserService userService;

    @RequestMapping(value = "/index")
    public String index() {
        return userService.say();
    }

}
