package com.example.web;


import com.example.web.service.MyService;
import com.example.web.service.impl.MyServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


//@RunWith(SpringRunner.class)
//@SpringBootTest
public class StudyApplicationTest {
    //public class Main {

    private MyService myService;

    @Test
    public void  casetst(){

        MyServiceImpl myService = new MyServiceImpl();

        myService.doOtherThing();

    }

}
