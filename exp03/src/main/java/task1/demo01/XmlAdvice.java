package task1.demo01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class XmlAdvice {
    //前置通知
    public void before(JoinPoint joinPoint){
        System.out.println("这是前置通知！");
        System.out.print("目标类是："+joinPoint.getTarget());
        System.out.println("，被织入增强处理的目标方法为："+joinPoint.getSignature().getName());
    }
    //返回通知
    public void afterReturing(JoinPoint jp) {
        System.out.print("这是返回通知（方法不出现异常时调用）！");
        System.out.println("被织入增强处理的目标方法为："+jp.getSignature().getName());
    }

/*
* 环绕通知
* ProceedingJoinPoint是JointPoint的子接口
* 1.必须是Object类型的返回值
* 2.必须接收一个参数，类型为ProceedingJoinPoint
* 3.必须throws Throwable
*/
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("这是环绕通知之前的部分！");
        Object obj = point.proceed();
        System.out.println("这是环绕通知之后的部分！");
        return obj;
    }
    //异常通知
    public void afterException(){
        System.out.println("异常通知！");
    }
    //后置通知
    public void after(){
        System.out.println("这是后置通知！");
    }

}
