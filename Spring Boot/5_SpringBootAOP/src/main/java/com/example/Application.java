package com.example;


import com.example.service.BusinessClass;
import com.example.service.BusinessClass2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    BusinessClass service;
    @Autowired
    BusinessClass2 service1;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub

        service.add();
        service.delete();
        service1.view();
    }

}
