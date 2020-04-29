package com.example.web.service.impl;

import com.example.web.dao.dos.City;
import com.example.web.dao.mappers.CityMapper;
import com.example.web.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CityMapper cityMapper;

    @Override
    public void doSomething(String code) {

        City chengdu  = cityMapper.getCityById(1);
        logger.info("do something... , city:" + chengdu.getName());
        chengdu  = cityMapper.getCityById2(1);
        logger.info("do something... , city:" + chengdu.getName());

    }
}
