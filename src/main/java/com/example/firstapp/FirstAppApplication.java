package com.example.firstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstAppApplication {

    public static void main(String[] args) {

        var ctx = SpringApplication.run(FirstAppApplication.class, args);

        MyFirstClass myFirstClass = ctx.getBean("myBean", MyFirstClass.class);
        System.out.println(myFirstClass.sayHello());
    }


}
