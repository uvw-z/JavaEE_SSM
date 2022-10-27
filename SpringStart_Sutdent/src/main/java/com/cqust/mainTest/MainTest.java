package com.cqust.mainTest;

import com.cqust.entity.Student;
import com.cqust.entity.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {

      //  Student s = new Student();
      //  s.say();
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student s=(Student)ac.getBean("student");
        s.say();
        Teacher t=(Teacher)ac.getBean("tea");
        t.speak();


    }
}
