package com.example.web.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * 某异常页面返回信息 , 用Exception可捕获一般异常
 *
 * ControllerAdvice的参数可以对某个controller.class指定
 * 和AppErrorController并存
 *
 */
@ControllerAdvice
public class ExceptionController extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ResponseBody
    public String errorHandle(Throwable ex){
        return "ExceptionController exception handle: " + ex.toString();
    }

}
