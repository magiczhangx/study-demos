package com.example.web.service.impl;

import com.example.web.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Size;

@Service
public class MyServiceImpl implements MyService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void doSomething(String code) {
        logger.info("do something... , code:" + code);

    }
}
