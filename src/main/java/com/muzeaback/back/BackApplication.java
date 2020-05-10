package com.muzeaback.back;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;

@SpringBootApplication
@ComponentScan({"com.muzeaback.back","com.muzeaback.back.Controller"})
public class BackApplication {


    public static void main(String[] args) {
       // new File(FileController.uploadDirectory).mkdir();
      //  System.out.println(FileController.uploadDirectory.toString());
        SpringApplication.run(BackApplication.class, args);
    }

}
