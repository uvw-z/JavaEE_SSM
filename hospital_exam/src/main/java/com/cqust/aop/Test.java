package com.cqust.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        ApplicationContext ac= new ClassPathXmlApplicationContext("application-aop.xml");

        DoctorDao doctorDao = ac.getBean(DoctorDao.class);
        doctorDao.delete();
        System.out.println();
        doctorDao.insert();
        System.out.println();
        doctorDao.select();
        System.out.println();
        doctorDao.update();
    }
}
