import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author yxt
 * @Description:
 * @date 2022/11/2 14:19
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        Orders o = (Orders) ac.getBean("orders");
        System.out.println(o);

    }
}
