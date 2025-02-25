package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")  // menangani request ke http://localhost:8080/
    public String home() {
        return "index";  // mengembalikan page "index.html" dari src/main/resources/static
    }
}