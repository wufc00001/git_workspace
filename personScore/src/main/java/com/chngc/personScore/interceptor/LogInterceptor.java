package com.chngc.personScore.interceptor;


import lombok.extern.slf4j.Slf4j;
import org.springframework.core.NamedThreadLocal;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class LogInterceptor extends HandlerInterceptorAdapter {

    private final static ThreadLocal<Long> threadLocal = new NamedThreadLocal<>("ThreadLocal Time");

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        // 使用ThreadLocal 绑定变量，只有当前线程可见
        threadLocal.set(startTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
       long endTime = System.currentTimeMillis();
       // 得到线程绑定的局部变量，获取线程中的开始时间
       long startTime = threadLocal.get();
       log.debug("【URI】:"+request.getRequestURI()+" 【耗时】："+(endTime-startTime)+"ms");
    }
}
