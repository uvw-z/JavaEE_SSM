package com.cqust.Junit;

import com.cqust.Entity.Student;
import com.cqust.Utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.util.List;

public class StudentTest {
    SqlSession session = MyBatisUtils.getSession();
    //关联映射 1:1
    @Test
    public void selectStudentWithCard(){
        Student s = session.selectOne("StudentMapper.selectStudentWithCard",2);
        System.out.println(s);
    }

    //CRUD
    @Test
    public void selectById(){
        Student s = session.selectOne("StudentMapper.selectById",1);
        System.out.println(s);
    }
    @Test
    public void selectAll(){
        List<Student> list=session.selectList("StudentMapper.selectAll");
        for (Student student : list) {
            System.out.println(student);
        }
    }
    @Test
    public void Insert(){
        Student s = new Student();
        s.setName("xyt");
        s.setSno("2020444223");
        s.setAge(20);
        s.setMajor("Software");
        session.insert("StudentMapper.insert",s);
        session.commit();
        System.out.println(s);
    }
    @Test
    public void Delete(){
            int i=session.delete("StudentMapper.delete",9);
            session.commit();
            if (i == 1) {
                System.out.println("删除student成功");
            }else {
                System.out.println("删除student失败");
            }
        }
    @Test
    public void Update(){
        Student student = new Student();
        student.setSid(1);
        student.setSno("2020444223");
        student.setName("yangxiaotong");
        student.setMajor("mba");
        int i=session.update("StudentMapper.update",student);
        session.commit();
        if (i == 1) {
            System.out.println("更新student成功");
        }else {
            System.out.println("更新student失败");
        }
    }
}
