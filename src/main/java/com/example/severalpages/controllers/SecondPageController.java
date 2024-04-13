package com.example.severalpages.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondPageController {
    @GetMapping("/second_page")
    public String index() {
        return "home/second_page";
    }
}
