package com.example.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @GetMapping("login")
    public String getLogin()
    {
        return "Login Successfully!";
    }

    @PostMapping("post")
    public String postLogin()
    {
        return "Data posted Successfully!";
    }

    @DeleteMapping("delete")
    public String delLogin()
    {
        return "Data Deleted Successfully!";
    }

    @PutMapping("update")
    public String updateLogin()
    {
        return "Data Updated Successfully!";
    }

}
