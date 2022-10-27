package task2.demo02.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
@Aspect
@Component
public class MyAdvice  {
    /*
    * 编写切面类MyAdvice 类，
    * 在切面类中定义前置通知log（）方法
    * 完成日志记录，该方法要求记录访问时间、访问方法的名称，访问方法的参数值
    * 并将日志信息保存到数据库。
    * */
    @Pointcut("execution(* task2.demo02.Controller.CardController.*(..))")
    public void pt(){}
    @Before("pt()")
    public void log(JoinPoint joinPoint) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("这是一个前置通知");
        System.out.println("切点信息"+joinPoint.toString());
        System.out.println("访问时间："+sdf.format(date));
        System.out.println("访问方法的名称："+joinPoint.getTarget());
        System.out.println("访问方法的参数："+joinPoint.getArgs());
        System.out.println();
    }
}

