package task1.demo02;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
@Aspect
public class AnnoAdvice {
    //切点
    @Pointcut("execution(* task1.demo02.UserDaoImpl.*(..))")
    public void pointcut(){ }
    @Before("pointcut()")
    public void before(JoinPoint joinPoint){
        System.out.println("这是前置通知！");
        System.out.print("目标类是："+joinPoint.getTarget());
        System.out.println("，被织入增强处理的目标方法为："+joinPoint.getSignature().getName());
    }
    @AfterReturning("pointcut()")
    public void afterReturing(JoinPoint jp) {
        System.out.print("这是返回通知（方法不出现异常时调用）！");
        System.out.println("被织入增强处理的目标方法为："+jp.getSignature().getName());
    }
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("这是环绕通知之前的部分！");
        Object obj = point.proceed();
        System.out.println("这是环绕通知之后的部分！");
        return obj;
    }
    @AfterThrowing("pointcut()")
    public void afterException(){
        System.out.println("异常通知！");
    }
    @After("pointcut()")
    public void after(){
        System.out.println("这是后置通知！");
    }
}
