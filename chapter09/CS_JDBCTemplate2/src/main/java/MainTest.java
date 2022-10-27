
import com.cqust.Dao.StudentDao;
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
//        System.out.println(jt);
//        String strSql = "insert into student(sno,name,age,major)VALUE('20010416','Ryujin',21,'Software')";
//        String strSq2="update student set `name`='Ryujin' where sid=5";
////      jt.execute(strSql);
//        jt.execute(strSq2);






    }
}
