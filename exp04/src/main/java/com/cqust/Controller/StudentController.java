package com.cqust.Controller;

import com.cqust.Biz.StudentBiz;
import com.cqust.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {
@Autowired
    private StudentBiz studentBiz;

    public void studentEnroll(String sno, String name, int age,String major){
        Student s =new Student();
        s.setAge(age);
        s.setName(name);
        s.setSno(sno);
        s.setMajor(major);
        int i= studentBiz.enrollStudent(s);
        if (i > 0) {
            System.out.println("student注册成功（studentcontroller）");
        }
        else {
            System.out.println("studentcontroller失败");
        }
    }
}
