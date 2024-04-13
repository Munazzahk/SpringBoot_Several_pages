package com.example.severalpages.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThirdsPageController {
    @GetMapping("/third_page")
    public String index() {
        return "home/third_page";
    }
}
