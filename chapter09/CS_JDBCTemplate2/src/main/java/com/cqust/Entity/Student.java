package com.cqust.Entity;

public class Student {
    private int sid;
    private String sno;
    private String name;
    private int age;
    private String major;

    public Student(String sno, String name, int age, String major) {
        this.sno = sno;
        this.name = name;
        this.age = age;
        this.major = major;
    }


    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sno='" + sno + '\'' +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", age=" + age +
                '}';
    }
}
