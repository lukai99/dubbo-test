package com.jiu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jiu.service.UserService;
import org.springframework.stereotype.Component;

@Component
@Service(version = "1.0", timeout = 3000, group = "user")
public class UserServiceImpl implements UserService {

    @Override
    public String say() {
        return "user";
    }
}
