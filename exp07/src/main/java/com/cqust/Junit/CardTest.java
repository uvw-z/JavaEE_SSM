package com.cqust.Junit;
import com.cqust.Entity.Card;
import com.cqust.Utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class CardTest {

    SqlSession session = MyBatisUtils.getSession();

    //关联映射--1对多
    @Test
    public void selectCardWithRecords(){
        Card c = session.selectOne("CardMapper.selectCardWithRecords",1);
        System.out.println(c);
    }


    //CRUD
    @Test
    public void selectAll(){
        List<Card> list=session.selectList("CardMapper.selectAll");
        for (Card card : list) {
            System.out.println(card);
        }
    }
    @Test
    public void selectById(){
        Card c = session.selectOne("CardMapper.selectById",1);
        System.out.println(c);
    }
    @Test
    public void Insert(){
        Card c = new Card();
        c.setSid(1);
        c.setSno("2020444223");
        c.setName("yangxiaotong");
        c.setCno("c01");
        c.setMoney(200);
        session.insert("CardMapper.insert",c);
        session.commit();
        System.out.println(c);
    }

    @Test
    public void Delete(){
        int i=session.delete("CardMapper.delete",1);
        session.commit();
        if (i == 1) {
            System.out.println("删除Card成功");
        }else {
            System.out.println("删除Card失败");
        }
    }

    @Test
    public void Update(){
        Card c = new Card();
        c.setSid(2);
        c.setSno("2020444223");
        c.setName("yangxiaotong");
        c.setCno("c02");
        int i=session.update("CardMapper.update",c);
        session.commit();
        if (i == 1) {
            System.out.println("更新card成功");
        }else {
            System.out.println("更新card失败");
        }
    }


}
