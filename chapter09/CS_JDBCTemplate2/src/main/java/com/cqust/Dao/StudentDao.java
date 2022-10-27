package com.cqust.Dao;

import com.cqust.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Scanner;

@Repository
public class StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public int insert2(Student s) {
        //创建Student对象,并向Student对象中添加数据
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生姓名：");
        String name = sc.next();
        System.out.print("请输入学生学号：");
        String sno = sc.next();
        System.out.print("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.print("请输入学生专业：");
        String major = sc.next();

        s.setName(name);
        s.setSno(sno);
        s.setAge(age);
        s.setMajor(major);

//        String strSql = "insert into student(sno,name,age,major)VALUE('%s','%s',%d,'%s')";
        String strSql = "insert into student(name,sno,age,major)VALUE(?,?,?,?)";
        Object[] objc=new Object[]{
                s.getName(),
                s.getSno(),
                s.getAge(),
                s.getMajor()
        };
        jdbcTemplate.update(strSql,objc);
        return 1;
    }


    public int updateById(int sid){
        return 1;
    }

    public int deleteById(int sid){
        String strSql="delete from student where sid=%d";
        strSql=String.format(strSql,sid);
        Scanner sc = new Scanner(System.in);
        System.out.println("输入您所需要删除学生的sid:"); //在MainTest中测试修改为print
        sid=sc.nextInt();
        System.out.println(sid);                          //在MainTest中测试不需要此条
        jdbcTemplate.execute(strSql);
        return 1;

    }


    //查询一个
    public Student selectById(int id){
        String strSql="Select * from student where sid=%d";
        strSql=String.format(strSql,id);
        //输入需要查询的id
        //使用Junit单元测试 Scanner类的参数控制台不能接收：Help-Edit Custom VM options：Deditable.java.test.console=true
        Scanner sc = new Scanner(System.in);
        System.out.println("输入您所需要查询的id:"); //在MainTest中测试修改为print
        id=sc.nextInt();
        System.out.println(id);                      //在MainTest中测试不需要此条
        System.out.print("查询的学生信息：");

        RowMapper<Student> rm =new BeanPropertyRowMapper<Student>(Student.class);
        return  jdbcTemplate.queryForObject(strSql,rm);
    }

    //查询多个
    public List<Student>selectByCondition(String strWhere) {
        String strSql="Select * from student";
        //输入查询条件
        Scanner sc=new Scanner(System.in);
        System.out.print("输入查询条件：");
        strWhere= sc.nextLine();
        System.out.println(strWhere );

        if (strWhere.trim().length() > 0)
            strSql = strSql + " where " + strWhere;
        //select * from student where ....
        RowMapper<Student> rm =new BeanPropertyRowMapper<Student>(Student.class);
        return jdbcTemplate.query(strSql, rm);
    }



}
