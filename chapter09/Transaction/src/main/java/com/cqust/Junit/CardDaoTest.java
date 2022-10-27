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
        card.setName("yangxiaotong");
        card.setSno("2020444223");
        card.setCno("2001");
        card.setMoney(50);
//        card.setLastAccessTime("2022/10/19");
        //执行insert方法
        int num=cardDao.insert(card);
        if (num >0 ) {
            System.out.println("增加一条card信息");
        }else {
            System.out.println("插入失败");
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
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }

    @Test
    public void Delete(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        CardDao cardDao = (CardDao) ac.getBean("cardDao");

        int num = cardDao.delete(3);
        if (num > 0) {
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }

    @Test
    public void selectById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CardDao cardDao = (CardDao) ac.getBean("cardDao");

        Card card = cardDao.selectById(2);
        System.out.println(card);
    }

    @Test
    public void selectAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CardDao cardDao = (CardDao) ac.getBean("cardDao");
        List<Card> cardList=cardDao.selectAllCard();
        for (Card card : cardList) {
            System.out.println(card);
        }
    }
}
