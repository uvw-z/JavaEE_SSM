package com.cqust.WebPage;

import com.cqust.controller.StudentController;
import com.cqust.entity.Book;
import com.cqust.entity.Student;
import com.cqust.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {

/*        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentController studentController=(StudentController) ac.getBean("studentController");
        studentController.studentEnroll("2020444223","yangxiaotong",20);*/

//     //2022年9月22日  2020444223_杨小童
//        //使用的静态工厂实例化
//        Student s1=(Student)ac.getBean("student1");
//        System.out.println(s1.toString());
//
//        //使用的实例工厂实例化
//        Student s2=(Student)ac.getBean("student2");
//        System.out.println(s2.toString());
//        Book b2=(Book) ac.getBean("book2");
//        System.out.println(b2.toString());

//2022年9月28日 2020444223_杨小童
//381735

        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student Sstudent=(Student)ac.getBean("student");
        StudentService Sservice = (StudentService)ac.getBean("studentService");
        Sservice.enrollStudent(Sstudent);

    }
}
