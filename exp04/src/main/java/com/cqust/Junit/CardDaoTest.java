package com.cqust.Junit;


import com.cqust.Dao.CardDao;
import com.cqust.Entity.Card;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class CardDaoTest {
    @Test
    public void Insert(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取Card、CardDao实例并向其加入数据
        CardDao cardDao = ac.getBean(CardDao.class);
        Card card = new Card();
        card.setSid(2);
        card.setName("Yangxiaotong");
        card.setSno("20010416");
        card.setCno("2001");
        card.setMoney(50);
//        card.setLastAccessTime("2022/10/19");
        //执行insert方法
        int num=cardDao.insert(card);
        if (num >0 ) {
            System.out.println("增加一条card信息");
        }else {
            System.out.println("插入card失败");
        }
    }

    @Test
    public void Update(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取Card、CardDao实例并修改数据
        CardDao cardDao = (CardDao) ac.getBean("cardDao");
        Card card = new Card();
        card.setCid(3);
        card.setCno("999999");
        //执行update方法
        int num = cardDao.update(card);
        if (num > 0) {
            System.out.println("修改card成功");
        }else {
            System.out.println("修改card失败");
        }
    }
    @Test
    public void Delete(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        CardDao cardDao = (CardDao) ac.getBean("cardDao");

        int num = cardDao.delete(3);
        if (num > 0) {
            System.out.println("删除card成功");
        }else {
            System.out.println("删除card失败");
        }
    }
    @Test
    public void selectById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CardDao cardDao = (CardDao) ac.getBean("cardDao");

        Card card = cardDao.selectById(2);
        System.out.println("通过cid查找card："+ card);
    }


    @Test
    public void selectBySno(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CardDao cardDao = (CardDao) ac.getBean("cardDao");
        Card card = cardDao.selectBySno("20010416");
        System.out.println("通过sno查找card："+ card);
    }

    /*查找余额*/
    @Test
    public void selectBySnoforMoney(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CardDao cardDao = (CardDao) ac.getBean("cardDao");
        Card card = cardDao.selectBySnoforMoney("20010416");
        System.out.println("通过sno查找余额，"+" sno："  +card.getSno()+ " "+"余额 "+card.getMoney());
    }

    @Test
    public void selectAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CardDao cardDao = (CardDao) ac.getBean("cardDao");
        List<Card> cardList=cardDao.selectAllCard();
        System.out.println("所有card：");
        for (Card card : cardList) {
            System.out.println(card);
        }
    }
}
