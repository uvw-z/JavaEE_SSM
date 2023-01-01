package com.cqust.Entity;

public class Department {
    private int Departd;
    private String  DepartName;
    private String  DepartPhone;

    @Override
    public String toString() {
        return "Department{" +
                "Departd=" + Departd +
                ", DepartName='" + DepartName + '\'' +
                ", DepartPhone='" + DepartPhone + '\'' +
                '}';
    }

    public int getDepartd() {
        return Departd;
    }

    public void setDepartd(int departd) {
        Departd = departd;
    }

    public String getDepartName() {
        return DepartName;
    }

    public void setDepartName(String departName) {
        DepartName = departName;
    }

    public String getDepartPhone() {
        return DepartPhone;
    }

    public void setDepartPhone(String departPhone) {
        DepartPhone = departPhone;
    }
}
