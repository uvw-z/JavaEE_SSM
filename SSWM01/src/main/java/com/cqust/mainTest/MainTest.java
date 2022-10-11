package com.cqust.mainTest;

import com.cqust.entity.Student;
import com.cqust.entity.Student_Setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {

        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student s=(Student)ac.getBean("student");
        s.speak();

        //杨小童： 431392

        ApplicationContext ac2=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student_Setter ss=(Student_Setter)ac2.getBean("student_setter");
        ss.speak();

    }
}
