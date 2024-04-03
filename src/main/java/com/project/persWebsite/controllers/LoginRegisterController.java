package com.project.persWebsite.controllers;

import com.project.persWebsite.dtos.RegisterDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class LoginRegisterController {

    @GetMapping("/")
    public String loginRegisterForm(){
        return "loginRegister";
    }

    @PostMapping
    public String registerForm(@RequestParam RegisterDto registerDto){


    }

}
