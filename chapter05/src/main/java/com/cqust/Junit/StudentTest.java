package com.cqust.Junit;

import com.cqust.Dao.StudentMapper;
import com.cqust.Entity.Student;
import com.cqust.Untils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;


public class StudentTest {
    SqlSession session=MybatisUtils.getSession();
    StudentMapper mapper = session.getMapper(StudentMapper.class);

    @Test
    public void selectById(){
        Student s = mapper.selectById(1);
        System.out.println(s);
    }

    @Test
    public void selectAll(){
        List<Student> students  = mapper.selectAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void updateById(){
        Student s =new Student();
        s.setSno("20010416");
        s.setName("yxt");
        s.setAge(21);
        s.setMajor("Software");
        s.setSid(1);
        int i = mapper.updateById(s);
        session.commit();
        if ( i>0) {
                System.out.println("成功更新"+i+"条消息："+s);
        }else {
                System.out.println("更新失败");
        }
    }
    @Test
    public void insert() {
        Student s = new Student();
        s.setSno("20031227");
        s.setName("yuna");
        s.setAge(18);
        s.setMajor("Software");
        int i=mapper.insert(s);
        session.commit();
        if ( i>0) {
            System.out.println("成功插入"+i+"条消息："+s);
        }else {
            System.out.println("插入失败失败");
        }
    }




}
