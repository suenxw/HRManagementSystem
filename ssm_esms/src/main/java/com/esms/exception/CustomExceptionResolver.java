package com.esms.exception;

//统一处理异常

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomExceptionResolver implements HandlerExceptionResolver {
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        CustomException customException = null;
        if (e instanceof CustomException) {
            customException = (CustomException) e;
            System.out.println(e);
        }else{
            customException = new CustomException("系统出现未知错误!");
        }

        System.out.println("错误:==="+e);
        String message = customException.getMessage();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message",message);
        modelAndView.setViewName("error/error.jsp");

        return modelAndView;
    }
}
