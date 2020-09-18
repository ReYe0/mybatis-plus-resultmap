package com.dreamyfish;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dreamyfish.mapper")
public class MybatisPlusResultmapApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusResultmapApplication.class, args);
    }

}
