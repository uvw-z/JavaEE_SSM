package com.cqust.JunitTest;


import com.cqust.Entity.Card;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.Reader;
import java.util.List;

public class CardTest {
    @Test
    public void selectById() {
        String strRes = "mybatis-config.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(strRes);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

            SqlSession session = factory.openSession();
            Card c = session.selectOne("com.cqust.Entity.Card.selectById", 1);
            System.out.println("查找成功：" +c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void SelectAll(){
        String strRes="mybatis-config.xml";
        Reader reader=null;
        try {
            reader= Resources.getResourceAsReader(strRes);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session=factory.openSession();

            List<Card> list=session.selectList("com.cqust.Entity.Card.selectAll");
            for (Card card : list) {
                System.out.println(card);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void Insert(){
        String strRes="mybatis-config.xml";
        Reader reader=null;
        try {
            reader= Resources.getResourceAsReader(strRes);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session=factory.openSession();

            Card card=new Card();
            card.setSid(3);
            card.setSno("20010416");
            card.setName("yangxiaotong");
            card.setMoney(100);
            session.insert("com.cqust.Entity.Card.insert",card);
            session.commit();
            System.out.println("新增Card："+card);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void Delete(){
        String strRes="mybatis-config.xml";
        Reader reader=null;
        try {
            reader= Resources.getResourceAsReader(strRes);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session=factory.openSession();
            session.delete("com.cqust.Entity.Card.delete",9);
            session.commit();
            System.out.println("删除Card成功");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void Update(){
        String strRes="mybatis-config.xml";
        Reader reader=null;
        try {
            reader=Resources.getResourceAsReader(strRes);
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = factory.openSession();

            Card c = new Card();
            c.setCid(2);
            c.setSid(3);
            c.setName("yxt");
            int i=session.update("com.cqust.Entity.Card.update",c);
            session.commit();
            System.out.println("更新Card成功");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
