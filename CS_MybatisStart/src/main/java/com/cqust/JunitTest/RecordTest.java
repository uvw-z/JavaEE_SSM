package com.cqust.JunitTest;


import com.cqust.Entity.Record;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.Reader;
import java.util.List;

public class RecordTest {
    @Test
    public void selectById() {
        String strRes = "mybatis-config.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(strRes);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

            SqlSession session = factory.openSession();
            Record r = session.selectOne("com.cqust.Entity.Record.selectById", 1);
            System.out.println("查找Record成功：" +r);
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

            List<Record> list=session.selectList("com.cqust.Entity.Record.selectAll");
            for (Record record : list) {
                System.out.println(record);
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

            Record record=new Record();
            record.setCid(3);
            record.setMemo("RecordInsert添加");
            session.insert("com.cqust.Entity.Record.insert",record);
            session.commit();
            System.out.println("新增Record："+record);
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
            session.delete("com.cqust.Entity.Record.delete",11);
            session.commit();
            System.out.println("删除Record成功");
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

            Record r = new Record();
            r.setRid(2);
            r.setCid(2);
            r.setMemo("RecordTest修改更新");
            r.setConsumePort("0");
            int i=session.update("com.cqust.Entity.Record.update",r);
            session.commit();
            System.out.println("更新Record成功");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}