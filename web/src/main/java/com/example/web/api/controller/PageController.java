package com.example.web.api.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/page/home")
    public String home() throws Exception {
      // throw new Exception();
        return "home.html";
    }
}
