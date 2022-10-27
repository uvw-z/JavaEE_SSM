package task2.demo01.WebPage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import task2.demo01.Controller.CardController;

public class XmlTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext2.xml");
        CardController ccontrol=(CardController)ac.getBean("cardController");
        ccontrol.charge("2020444223",300);

    }
}
