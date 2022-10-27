package task2.demo02.WebPage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import task2.demo02.Controller.CardController;

public class AnnoTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext3.xml");
        CardController cc=ac.getBean("cardController",CardController.class);
        cc.charge("2020444223",20);

    }
}
