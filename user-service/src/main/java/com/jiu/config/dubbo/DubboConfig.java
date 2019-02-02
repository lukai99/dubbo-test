package com.jiu.config.dubbo;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@DubboComponentScan(basePackages = {"com.jiu.service.impl"})//扫描dubbo注解
public class DubboConfig {

    /**
     * 应用名
     *
     * @return
     */
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("jiu-user-provider");
        return applicationConfig;
    }

    /**
     * <dubbo:provider timeout="10000" />
     *
     * @return
     */
    @Bean
    public ProviderConfig providerConfig() {
        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setTimeout(10000);
        return providerConfig;
    }


    /**
     * 地址配置 <dubbo:registry address="zookeeper://127.0.0.1:2181" client="zkclient"/>
     *
     * @return
     */
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://47.105.45.74:2181");
        registryConfig.setClient("zkclient");
        return registryConfig;
    }


    /**
     * 协议配置，等同于 <dubbo:protocol name="dubbo" port="20880" />
     *
     * @return ProtocolConfig
     */
    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        return protocolConfig;
    }

}
