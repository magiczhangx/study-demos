package com.example.web.service;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Size;

@Validated
public interface MyService {

    void doSomething(/*@Size(min = 9 , max = 20)*/ String code);
}
