package com.cqust.Junit;

//注意是import pojo
import com.cqust.Pojo.Student;
import com.cqust.Untils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Student_Pojo {

    @Test
    public void findAllStudent(){
        SqlSession session = MybatisUtils.getSession();
        List<Student> list = session.selectList("com.cqust.Pojo.Student.findAllStudent");
        for (Student student : list) {
            System.out.println(student);
        }
    }

}
