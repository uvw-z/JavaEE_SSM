package com.cqust.Junit;

import com.cqust.Biz.CardBiz;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Transaction {
    @Test
    public void ConsumeCard(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CardBiz cb=ac.getBean(CardBiz.class);

        int i=  cb.consumeTransaction("20010416",1);
        if (i==1) {
            System.out.println("已消费");
        }
    }
    @Test
    public void ChargeCard(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CardBiz cb=ac.getBean(CardBiz.class);

        int i= cb.chargeTransaction("20010416",2);
        if (i==1) {
            System.out.println("已充值");
        }
    }




}
