package com.cqust.Junit;

import com.cqust.Entity.Card;
import com.cqust.Untils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class CardTest {

    //关联映射--1对多
    @Test
    public void selectCardWithRecords(){
        SqlSession session = MybatisUtils.getSession();
        Card c = session.selectOne("CardM.selectCardWithRecords",1);
        System.out.println(c);
    }


    @Test
    public void selectAll(){
        SqlSession session= MybatisUtils.getSession();
        List<Card> list=session.selectList("CardM.selectAll");
        for (Card card : list) {
            System.out.println(card);
        }
    }
    @Test
    public void selectById(){
        SqlSession session = MybatisUtils.getSession();
        Card c = session.selectOne("CardM.selectById",1);
        System.out.println(c);
    }
    @Test
    public void Insert(){
        SqlSession session = MybatisUtils.getSession();
        Card c = new Card();
        c.setSid(1);
        c.setSno("2020444223");
        c.setName("yangxiaotong");
        c.setCno("c01");
        c.setMoney(200);
        session.insert("CardM.insert",c);
        session.commit();
        System.out.println(c);
    }

    @Test
    public void Delete(){
        SqlSession session=MybatisUtils.getSession();
        int i=session.delete("CardM.delete",1);
        session.commit();
        if (i == 1) {
            System.out.println("删除Card成功");
        }else {
            System.out.println("删除Card失败");
        }
    }

    @Test
    public void Update(){
        SqlSession session = MybatisUtils.getSession();
        Card c = new Card();
        c.setSid(2);
        c.setSno("2020444223");
        c.setName("yangxiaotong");
        c.setCno("c02");
        int i=session.update("update",c);
        session.commit();
        if (i == 1) {
            System.out.println("更新card成功");
        }else {
            System.out.println("更新card失败");
        }
    }


}
