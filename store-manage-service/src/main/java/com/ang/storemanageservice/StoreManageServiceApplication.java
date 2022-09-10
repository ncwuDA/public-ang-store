package com.ang.storemanageservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ang.storemanageservice.dao")
public class StoreManageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreManageServiceApplication.class, args);
    }

}
