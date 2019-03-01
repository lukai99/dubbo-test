package com.jiu.config.dubbo;

import org.springframework.stereotype.Component;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

@Component
public class Config {

    public static String APPLICATION_NAME;
    public static String PROVIDER_TIMEOUT;

    public static String ZOO_ADDRESS;
    public static String CLIENT;

    public static String PROTOCOL_NAME;
    public static String PROTOCOL_PORT;


    static {
        Properties prop = new Properties();
        try {
            String relativelyPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resource" + File.separator + "dubbo.properties";
            System.out.println("path===>" + relativelyPath);
            InputStream in = new BufferedInputStream(new FileInputStream(relativelyPath));
            prop.load(in);

            APPLICATION_NAME = prop.getProperty("APPLICATION_NAME");
            PROVIDER_TIMEOUT = prop.getProperty("PROVIDER_TIMEOUT");

            ZOO_ADDRESS = prop.getProperty("ZOO_ADDRESS");
            CLIENT = prop.getProperty("CLIENT");

            PROTOCOL_NAME = prop.getProperty("PROTOCOL_NAME");
            PROTOCOL_PORT = prop.getProperty("PROTOCOL_PORT");


        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("配置文件APPLICATION_NAME=" + APPLICATION_NAME);
            System.out.println("配置文件PROVIDER_TIMEOUT=" + PROVIDER_TIMEOUT);
            System.out.println("配置文件ZOO_ADDRESS=" + ZOO_ADDRESS);
            System.out.println("配置文件CLIENT=" + CLIENT);
            System.out.println("配置文件PROTOCOL_NAME=" + PROTOCOL_NAME);
            System.out.println("配置文件PROTOCOL_PORT=" + PROTOCOL_PORT);
        }

    }
}
