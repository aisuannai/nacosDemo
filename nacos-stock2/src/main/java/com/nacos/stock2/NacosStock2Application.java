package com.nacos.stock2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//让注册中心发现
@EnableDiscoveryClient
public class NacosStock2Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosStock2Application.class, args);
    }
}
