package com.cqust.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyRight {
    @Pointcut("execution(* com.cqust.Controller.CardController.*(..))")
    public void pointcut(){

    }
    @Before("pointcut()")
    public void beforecheck(JoinPoint joinPoint) {
        System.out.println(joinPoint.toString());
        System.out.println(joinPoint.getArgs());
        System.out.println(joinPoint.getTarget());
        System.out.println("before doing...");
    }

    @After("pointcut()")
    public void afterecheck(JoinPoint jp) {
        System.out.println(jp.toString());
        System.out.println(jp.getArgs());
        System.out.println(jp.getTarget());
        System.out.println("after doing...");
    }
    @Around("pointcut()")
    public Object aroundcheck(ProceedingJoinPoint point) throws Throwable{
        System.out.println("环绕通知之前的部分");
        Object object=point.proceed();
        System.out.println("环绕通知结束的部分");
        return object;
    }








}
