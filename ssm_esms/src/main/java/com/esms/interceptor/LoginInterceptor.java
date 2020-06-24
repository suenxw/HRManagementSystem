package com.esms.interceptor;

import com.esms.dao.SystemManager;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: ssm
 * @Author：admin
 * @Description：
 * @Version: 1.0
 */

//拦截器


public class LoginInterceptor implements HandlerInterceptor {


    /**
     * 预处理回调方法，实现处理器的预处理（如检查登陆），第三个参数为响应的处理器，自定义Controller
     * 返回值：true表示继续流程（如调用下一个拦截器或处理器）；false表示流程中断
     （如登录检查失败），不会继续调用其他的拦截器或处理器，此时我们需要通过response来产生响应；
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest,
                             HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("======================================================");
        String string1 = String.valueOf(httpServletRequest.getSession().getAttribute("employeeId"));
//        String string1 = (String) httpServletRequest.getSession().getAttribute("employeeId");
        System.out.println("登录的employeeid:"+string1);
        SystemManager systemManager = (SystemManager) httpServletRequest.getSession().getAttribute("admin");
        System.out.println("systemManager:"+systemManager);

        String contextPath = httpServletRequest.getContextPath();
        System.out.println("contextPath:=="+contextPath);
        String servletPath = httpServletRequest.getServletPath();
        System.out.println("servletPath:=="+servletPath);
        StringBuffer requestURL = httpServletRequest.getRequestURL();
        System.out.println("requestURL:=="+requestURL);

//        if (contextPath.equals("/ssm_esms")){
//            return true;
//        }
        if (string1 == null && systemManager == null){
//            httpServletResponse.sendRedirect("/");
            RequestDispatcher dispatcher =httpServletRequest.getRequestDispatcher("/");
            dispatcher.forward(httpServletRequest,httpServletResponse);
//            httpServletRequest.getRequestDispatcher("/").forward(httpServletRequest, httpServletResponse);
            System.out.println("产生了拦截");
            return false;
        }else {
            System.out.println("进入了拦截方法，但是没有拦截");
            return true;
        }
    }



    /**
     * 后处理回调方法，实现处理器的后处理（但在渲染视图之前），此时我们可以
     通过modelAndView（模型和视图对象）对模型数据进行处理或对视图进行处理，modelAndView也可能为null。
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse,
                           Object o, ModelAndView modelAndView) throws Exception {

    }



    /**
     * 整个请求处理完毕回调方法，即在视图渲染完毕时回调，如性能监控中我们可以在此记录结束时间并输出消耗时间，还可以进行一些资源清理，类似于try-catch-finally中的finally，但仅调用处理器执行链中
     */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse,
                                Object o, Exception e) throws Exception {

    }
}
