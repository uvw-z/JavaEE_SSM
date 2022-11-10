package com.cqust.Junit;

import com.cqust.Entity.Student;
import com.cqust.Untils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTest {

    //Dynamic CRUD
    @Test
    public void findByNameandMajor(){
        SqlSession session =MybatisUtils.getSession();
        Student s = new Student();
        s.setName("yangxiaotong");
        s.setMajor("Software");
        List<Student> list = session.selectList("StudentM.findByNameAndMajor",s);
        for (Student student : list) {
            System.out.println(student);
        }
    }
    @Test
    public void findByNameOrMajor(){
        SqlSession session =MybatisUtils.getSession();
        Student s = new Student();
        s.setName("yangxiaotong");
        s.setMajor("Software");
        List<Student> list = session.selectList("StudentM.findByNameOrMajor",s);
        for (Student student : list) {
            System.out.println(student);
        }
    }
    @Test
    public void updateBySet(){
        SqlSession session =MybatisUtils.getSession();
        Student s = new Student();
        s.setSid(1);
        s.setSno("20000526");
        int rows = session.update("StudentM.updateBySet",s);
        if (rows > 0) {
            System.out.println("成功修改了"+rows+"条数据！");
        }else {
            System.out.println("执行修改操作失败！！！");
        }
        session.commit();
    }

    @Test
    public void findByArray(){
        SqlSession session = MybatisUtils.getSession();
        //创建数组，封装查询id
        Integer[] roleIds = {2,3};
        //执行SqlSession查询结果，返回结果集
        List<Student> list = session.selectList("StudentM.findByArray",roleIds);
        for (Student student :list){
            System.out.println(student);
        }
        session.close();
    }

    @Test
    public void findByList(){
        SqlSession session = MybatisUtils.getSession();
        //创建List集合，封装查询id
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        //执行SqlSession查询结果，返回结果集
        List<Student> list = session.selectList("StudentM.findByList",ids);
        for (Student student :list){
            System.out.println(student);
        }
        session.close();
    }
    @Test
    public void findByMap(){
        SqlSession session = MybatisUtils.getSession();
        //创建List集合，封装查询id
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        Map<String,Object> conditionMap = new HashMap<String, Object>();
        conditionMap.put("sid",ids);
        conditionMap.put("major","Software");
        //执行SqlSession查询结果，返回结果集(在id:1 2 3的学生中找major为Software的学生）
        List<Student> list = session.selectList("StudentM.findByMap",conditionMap);
        for (Student student :list){
            System.out.println(student);
        }
        session.close();
    }




    @Test
    public void selectById_sql(){
        SqlSession session=MybatisUtils.getSession();
        Student student = session.selectOne("StudentM.selectById_sql",1);
        System.out.println(student);
    }

    //CRUD
    @Test
    public void selectById(){
        SqlSession session = MybatisUtils.getSession();
        Student s = session.selectOne("StudentM.selectById",1);
        System.out.println(s);
    }
    @Test
    public void selectAll(){
        SqlSession session=MybatisUtils.getSession();
        //Student s=new Student();
        // List<Student> list=session.selectList("com.cqust.Entity.Student.selectAll",s);
        List<Student> list=session.selectList("StudentM.selectAll");
        for (Student student : list) {
            System.out.println(student);
        }
    }

    @Test
    public void Insert(){
        SqlSession session = MybatisUtils.getSession();
        Student s = new Student();
        s.setName("xyt");
        s.setSno("2020444223");
        s.setAge(20);
        s.setMajor("Software");
        session.insert("StudentM.insert",s);
        session.commit();
        System.out.println(s);
    }

    @Test
    public void Delete(){
            SqlSession session=MybatisUtils.getSession();
            int i=session.delete("Student.delete",9);
            session.commit();
            if (i == 1) {
                System.out.println("删除student成功");
            }else {
                System.out.println("删除student失败");
            }
        }

    @Test
    public void Update(){
        SqlSession session = MybatisUtils.getSession();
        Student student = new Student();
        student.setSid(1);
        student.setSno("2020444223");
        student.setName("yangxiaotong");
        student.setMajor("mba");
        int i=session.update("update",student);
        session.commit();
        if (i == 1) {
            System.out.println("更新student成功");
        }else {
            System.out.println("更新student失败");
        }
    }
}
