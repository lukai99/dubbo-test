package com.jiu.config;

import com.jiu.config.app.AppConfig;
import com.jiu.config.dubbo.DubboConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * 服务启动加载
 */
public class MyApplicationContextInitializer implements WebApplicationInitializer{

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        //加载配置文件
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(AppConfig.class, DubboConfig.class);
        rootContext.refresh();

    }
}
