package com.example.web;


import com.example.web.service.MyService;
import com.example.web.service.impl.MyServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.*;


//@RunWith(SpringRunner.class)
//@SpringBootTest
public class StudyApplicationTests {
    //public class Main {

    @Autowired
    private MyService myService;

    @Test
    public void  casetst(){
        //myService.doSomething("ff");
        MyService myService = new MyServiceImpl();
//        myService.doSomething("ok");
    }

}
