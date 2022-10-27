package com.cqust.JunitTest;

import com.cqust.Entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.Reader;
import java.util.List;

public class StudentTest {
    @Test
    public void SelectById(){
        String strRes="mybatis-config.xml";
        Reader reader=null;
        try {
            reader= Resources.getResourceAsReader(strRes);

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

            SqlSession session=factory.openSession();
            Student s = session.selectOne("com.cqust.Entity.Student.selectById",2);
            System.out.println(s);
        }
        catch (Exception e) {
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
            List<Student> list=session.selectList("com.cqust.Entity.Student.selectAll");
            for (Student student : list) {
                System.out.println(student);
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

            Student s=new Student();
            s.setSno("20010416");
            s.setName("yangxiaotong");
            s.setAge(21);
            s.setMajor("Software");
            session.insert("com.cqust.Entity.Student.insert",s);
            session.commit();
            System.out.println(s);

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


            int i=session.delete("com.cqust.Entity.Student.delete",9);
            session.commit();
           if (i == 1) {
               System.out.println("删除student成功");
           }else {
               System.out.println("删除student失败");
            }
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = factory.openSession();
        Student student = new Student();
        student.setSid(12);
        student.setSno("20010323");
        student.setName("yxt");
        student.setMajor("mba");
        int i=session.update("com.cqust.Entity.Student.update",student);
         session.commit();
        if (i == 1) {
            System.out.println("更新student成功");
        }else {
            System.out.println("更新student失败");
        }
    }



}
