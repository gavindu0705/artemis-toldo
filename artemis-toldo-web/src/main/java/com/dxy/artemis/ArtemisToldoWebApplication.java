package com.dxy.artemis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dxy.artemis.toldo.dao.mapper")
public class ArtemisToldoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtemisToldoWebApplication.class, args);
    }

}
