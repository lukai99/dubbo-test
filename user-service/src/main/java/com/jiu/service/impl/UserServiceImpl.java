package com.jiu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jiu.service.UserService;
import org.springframework.stereotype.Component;

/**
 * Created by lukai on 2018/12/19.
 */
@Component
@Service(version = "1.0", timeout = 3000)
public class UserServiceImpl implements UserService {
    @Override
    public String say() {
        return "yyy";
    }
}
