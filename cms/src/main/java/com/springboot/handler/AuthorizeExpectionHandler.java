package com.springboot.handler;

import com.springboot.excpetion.AuthorizeException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 拦截登录异常
 * Created by Administrator on 2018/9/28 0028.
 */

@ControllerAdvice
public class AuthorizeExpectionHandler {

    @ExceptionHandler(value = AuthorizeException.class)
    public ModelAndView handlerAuthorizeExpection() {
        return new ModelAndView("redirect:/login");
    }
}
