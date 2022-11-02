package com.cqust.Junit;

import com.cqust.Controller.CardController;
import com.cqust.Controller.RecordController;
import com.cqust.Controller.StudentController;
import org.aspectj.lang.annotation.Aspect;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Aspect
public class Biz_Controller {
    @Test
// Student相关
    public void studentEnroll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentController sc =ac.getBean(StudentController.class);
        sc.studentEnroll("20010416008","yxt",30,"SoftWare");
    }

//Card相关
    @Test
    public void openAccount() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CardController cc = ac.getBean(CardController.class);
        cc.openAccount("20010416","Yangxiaotong","01",100);
    }
    @Test
    public void charge(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CardController cc = ac.getBean(CardController.class);
        cc.charge("20010416",1);
    }

    @Test
    public void consume(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CardController cc = ac.getBean(CardController.class);
        cc.consume("20010416",10);
    }

    @Test
    public void queryMoney(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CardController cc = ac.getBean(CardController.class);
        cc.queryMoney("20010416");
    }

//Record相关

    @Test
    public void queryRecord(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        RecordController rc=ac.getBean(RecordController.class);
        rc.ConsumeRecordquery("cno='2001'");
    }

}
