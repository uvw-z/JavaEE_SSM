package com.cqust.WebPage;

import com.cqust.Controller.CardController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CardController ccontrol=(CardController)ac.getBean("cardController");
        ccontrol.charge("2020444223",300);

    }
}
