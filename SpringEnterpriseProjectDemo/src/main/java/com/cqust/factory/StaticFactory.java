package com.cqust.factory;

import com.cqust.entity.Book;
import com.cqust.entity.Student;

public class StaticFactory {
    private static Student student= new Student();
    private static Book book= new Book();

    public static Student CreateStudent() {

        student.setSno("2020444223");
        student.setName("杨小童");
        student.setAge(20);
        return student;
    }

    public static Book CreateBook() {
        return book;
    }
}
