package com.cqust.factory;

import com.cqust.entity.Book;
import com.cqust.entity.Student;

public class InstanceFactory {

    private  Student student= new Student();
    private  Book book= new Book();

    public  Student CreateStudent() {


        student.setSno("2020444223");
        student.setName("杨小童");
        student.setAge(20);
        return student;
    }

    public  Book CreateBook() {

        return book;
    }
}
