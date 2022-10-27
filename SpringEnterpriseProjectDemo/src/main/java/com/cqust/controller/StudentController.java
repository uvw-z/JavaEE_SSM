package com.cqust.controller;

import com.cqust.entity.Student;
import com.cqust.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//interaction with Web Page,fronter(Android API,Main); 与前端进行交互
//@Component
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    public void studentEnroll(String sno, String name, int age){
        Student s =new Student();
        s.setAge(age);
        s.setName(name);
        s.setSno(sno);
        studentService.enrollStudent(s);

    }
}
