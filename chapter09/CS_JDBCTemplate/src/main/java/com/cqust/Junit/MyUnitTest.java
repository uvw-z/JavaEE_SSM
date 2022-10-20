package com.cqust.Junit;

import com.cqust.Dao.StudentDao;


import com.cqust.Entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Scanner;


public class MyUnitTest {

    //增加
    //此函数可以单独运行
    @Test
    public void Insert(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao sdao=(StudentDao)ac.getBean("studentDao");

        Student s = new Student();
        s.setSno("20000526");
        s.setAge(22);
        s.setMajor("Software");
        s.setName("Hwangyeji");

        int flag=sdao.insert(s);
        if (flag == 1) {
            System.out.println("新增card成功");
        }
    }

    @Test
    public void Update() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao sd = (StudentDao)ac.getBean("studentDao");

        Student student=new Student();
        student.setSid(2);
        student.setName("lia");
        student.setSno("200000");

        int flag=sd.updateById(student);
        if (flag > 0) {
            System.out.println("成功修改了"+ flag +"条数据");
        }else {
            System.out.println("修改card失败");
        }
    }


    @Test
    public void Delete(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao sdao=(StudentDao)ac.getBean("studentDao");
        int flag=sdao.deleteById(18);
        if (flag==1)
            System.out.println("删除card成功");

    }



    //查询teacher
    @Test
    public void StudentDaoSelectById() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao sdao = (StudentDao)ac.getBean("studentDao");
        Student s = sdao.selectById(8);
        System.out.println("查询card"+s);

    }



    @Test
    public void StudentDaoSelectByCondition() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao sdao = (StudentDao)ac.getBean("studentDao");
        List<Student> lst =sdao.selectByCondition("");
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
    }


}
