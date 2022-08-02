package com.example.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * javaFx采用springboot方式
 * 1、新建一个JavaFX 入口类，继承javafx.application.Application，定义静态调用launch(args)方法，重写start
 * 2、在springboot入口main方法中调用该静态方法。
 */
@SpringBootApplication
public class SpringbootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAppApplication.class, args);
        JavaFxStartMain.startMain(args);
    }

}
