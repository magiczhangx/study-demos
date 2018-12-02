package com.example.web.api.controller;

import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 一般错误页面返回信息, 覆盖spring-boot默认"whitelabel"页面
 * 可以和ExceptionController并存
 */
@RestController
public class AppErrorController implements ErrorController {

    /**
     * 如果不覆盖ErrorController的/error路径, 也可以加一个view改变 ,个人觉得覆盖controller简单好理解
     *
     * For example, to map 404 to a static HTML file, your folder structure would be as follows:
     *
     * src/
     *  +- main/
     *      +- java/
     *      |   + <source code>
     *      +- resources/
     *          +- public/
     *              +- error/
     *              |   +- 404.html
     *              +- <other public assets>
     * @return
     */
    @RequestMapping("/error")
    @ResponseBody
    public String errorHandle(){
        return "error";
    }

    @Override
    public String getErrorPath() {
        return null;
    }
}
