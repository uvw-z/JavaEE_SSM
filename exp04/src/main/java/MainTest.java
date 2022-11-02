
import com.cqust.Biz.CardBiz;
import com.cqust.Controller.CardController;
import com.cqust.Controller.StudentController;
import com.cqust.Dao.CardDao;
import com.cqust.Dao.StudentDao;
import com.cqust.Entity.Card;
import com.cqust.Entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Scanner;




public class MainTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jt = ac.getBean(JdbcTemplate.class);


        /*某个同学注册studentEnroll*/
//        StudentController sc =ac.getBean(StudentController.class);
//        sc.studentEnroll("2001041602","yangxiaotong",30,"SoftWare");

       /*开卡openAccount,消费consume,充值charge*/
//        CardController cc = ac.getBean(CardController.class);
//        cc.charge("20010416",1);



        //开卡
      /*  CardController cc=ac.getBean(CardController.class);
        cc.openAccount("20010416","Yangxiaotong","0000",100);
*/
/*
        CardBiz cb = ac.getBean(CardBiz.class);
        cb.openAccount("20010416","Yangxiaotong","0000",100);*/
/*
        CardController cc = ac.getBean(CardController.class);
        cc.charge("20010416",1);*/

        CardBiz cb=ac.getBean(CardBiz.class);
//       int i= cb.transfer("Hwangyeji","yxt ",10);
//       if (i==1) {
//           System.out.println("transfer成功");
//}


      /*int i=  cb.consumeTransaction("20010416",1);
       int i= cb.chargeTransaction("20010416",2);*/
    }
}
