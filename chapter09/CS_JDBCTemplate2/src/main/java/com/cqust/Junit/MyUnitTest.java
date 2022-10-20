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



    @Test
    public void Insert2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao sdao=(StudentDao)ac.getBean("studentDao");
        //1.构造方法创建Student：
        Student s = new Student("ss","ss",2,"ss"); //此处参数无意义，只是填充。
//        2.Setter方法创建Student：但是需要关闭实体类中的构造方法
//        Student s=new Student();
//        s.setName("1");
//        s.setAge(20);
//        s.setMajor("major");
//        s.setSno("1222");
//        sdao.insert2(s);
        sdao.insert2(s);
        System.out.println("添加的学生："+s);

    }



    @Test
    public void Update() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jt = ac.getBean(JdbcTemplate.class);
        System.out.println(jt);
        String strSq2="update student set `name`='yxy' where sno=20010416";
        jt.execute(strSq2);
    }



    @Test
    public void Delete() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao studentDao = (StudentDao) ac.getBean("studentDao");


        int flag = studentDao.deleteById(1);
        if (flag == 1) {
            System.out.println("删除成功");
        }
    }


    //查询teacher
/*    @Test
    public void StudentDaoSelectById() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao sdao = (StudentDao)ac.getBean("studentDao");
        Student s = sdao.selectById(1);
        System.out.println(s);
    }*/

    //查询（改进）
    @Test
    public void StudentDaoSelectById() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao sdao = (StudentDao)ac.getBean("studentDao");

        Student s = sdao.selectById(123); //此处的参数无意义，实际是从StudentDao传入的Id
        System.out.println(s);
        return;
    }





    @Test
    public void StudentDaoSelectByCondition() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao sdao = (StudentDao)ac.getBean("studentDao");

        List<Student> lst =sdao.selectByCondition(""); //此处输入strWhere的值也无意义
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
    }


}
