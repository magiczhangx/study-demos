package com.example.web.api.controller;

import com.example.web.api.vo.HomePageVo;
import com.example.web.api.vo.ProfileVo;
import com.example.web.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    @Qualifier("home")
    private HomePageVo home;

    @Autowired
    @Qualifier("home2")
    private HomePageVo home2;

    @Autowired
    private ProfileVo profileVo;

    @Autowired
    private MyService myService;

    @RequestMapping("/home")
    public HomePageVo getHome() {

        myService.doSomething("18");
        return home;
    }

    @RequestMapping("/home2")
    @GetMapping
    public HomePageVo getHome2() { return home2; }

    @RequestMapping("/profile")
    public ProfileVo getProfile(){return profileVo;}
}
