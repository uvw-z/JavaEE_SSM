package com.cqust.aop;

public class DoctorDaoImpl implements DoctorDao {
    @Override
    public void insert() {
        System.out.println("添加医生信息");
    }

    @Override
    public void delete() {
        System.out.println("删除医生信息");
    }

    @Override
    public void update() {
        System.out.println("更新医生信息");
    }

    @Override
    public void select() {
        System.out.println("查询医生信息");
    }
}