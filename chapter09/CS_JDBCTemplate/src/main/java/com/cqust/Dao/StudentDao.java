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
    //有了注解，setter方法可以省去
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insert(Student s){
        System.out.println("insert:"+s);
        String strSql="insert into student(sno,name,age,major)VALUE('%s','%s',%d,'%s')";
        strSql=String.format(strSql,
                s.getSno(),
                s.getName(),
                s.getAge(),
                s.getMajor());
        jdbcTemplate.execute(strSql);

        strSql="select *from student ORDER BY sid DESC LIMIT 1;";
        RowMapper<Student> rm = new BeanPropertyRowMapper<Student>(Student.class);
            Student student = jdbcTemplate.queryForObject(strSql,rm);
            s.setSid(student.getSid());
        return student.getSid(); //创建student之后，返回主键sid
    }

    public int updateById(Student student){
       String sql ="update student set name=?,sno=? where sid =?";
       Object[] obj = new Object[] {
               student.getName(),
               student.getSno(),
               student.getSid(),
               };
       int num = this.jdbcTemplate.update(sql,obj);
       return num;
    }

    public int deleteById(int id){
        String strSql="delete from student where sid=%d";
        strSql=String.format(strSql,id);
        jdbcTemplate.execute(strSql);
        return 1;
    }
        //查询一个
    public Student selectById(int id){
        String strSql="Select * from student where sid=%d";
        strSql=String.format(strSql,id);
        RowMapper<Student> rm =new BeanPropertyRowMapper<Student>(Student.class);
        return  jdbcTemplate.queryForObject(strSql,rm);
    }

    //查询多个
    public List<Student>selectByCondition(String strWhere) {
        String strSql="Select * from student";
        if (strWhere.trim().length() > 0)
            strSql = strSql + " where " + strWhere;
        //select * from student where ....
        RowMapper<Student> rm =new BeanPropertyRowMapper<Student>(Student.class);
        return jdbcTemplate.query(strSql, rm);
    }



}
