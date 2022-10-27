package task1.demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXml {
    public static void main(String[] args) {
        ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = ac.getBean(UserDao.class);
        userDao.delete();
        System.out.println();
        userDao.insert();
        System.out.println();
        userDao.select();
        System.out.println();
        userDao.update();
    }
}
