package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homepage {

    @GetMapping("/home")
    public String home() {
        return "Login Successful Welcome Home";
    }
}



//@Controller	View/JSP return karta hai
//@RestController	Direct text/JSON return karta hai
//@ResponseBody	Direct response me print karta hai
