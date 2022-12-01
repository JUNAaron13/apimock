package com.sliangy;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {Application.class})
@MapperScan("com.sliangy.dao")
public class Application {
    public static void main(String[] args) {
      SpringApplication.run(Application.class,args);
    }
}
