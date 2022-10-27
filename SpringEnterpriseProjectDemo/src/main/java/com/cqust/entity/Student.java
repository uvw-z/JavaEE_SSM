package com.cqust.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    private Book book;
    @Value("2020444223")
    private String sno;
    @Value("Yangxiaotong")
    private String name;
    @Value("20")
    private int age;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void speak(){
        System.out.println("Student{"+
                "sno='" + sno + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}');
        }

    @Override
    public String toString() {
        return "Student{" +
                "book=" + book +
                ", sno='" + sno + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
