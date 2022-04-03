package com.cs4.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
@RestController
@MapperScan("com.cs4.springboot.mapper")
public class SpringbootApplication {

    @GetMapping("/")
    public String hello() {
        return "Hello WJQ!";
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }





}


