package com.cqust.entity;

public class Student_Setter {
    private String name;
    private int age;
    private Book book;
//Getter and Setter method
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Book getBook() {
        return book;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBook(Book book) {
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

