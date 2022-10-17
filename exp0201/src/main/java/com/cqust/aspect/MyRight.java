package com.cqust.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class MyRight {
    public void beforecheck(JoinPoint joinPoint) {
        System.out.println(joinPoint.toString());
        System.out.print("目标方法参数："+joinPoint.getArgs());
        System.out.println("，目标对象："+joinPoint.getTarget());
        System.out.println("before doing...");
        System.out.println();
    }

    public void afterecheck(JoinPoint jp) {
        System.out.println(jp.toString());
        System.out.print("目标方法参数："+jp.getArgs());
        System.out.println("，目标对象："+jp.getTarget());
        System.out.println("after doing...");
        System.out.println();
    }

    public Object aroundcheck(ProceedingJoinPoint point) throws Throwable{
        System.out.println("环绕通知之前的部分");
        Object object=point.proceed();
        System.out.println("环绕通知结束的部分");
        System.out.println();
        return object;

    }








}
