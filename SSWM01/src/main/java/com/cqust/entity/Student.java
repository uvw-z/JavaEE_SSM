package com.cqust.entity;

public class Student {
    private String name;
    private int age;
    private Book book;

    public Student(String name, int age, Book book) {
        this.name = name;
        this.age = age;
        this.book = book;
    }

    public void speak(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", book=" + book +
                '}';
    }
}
