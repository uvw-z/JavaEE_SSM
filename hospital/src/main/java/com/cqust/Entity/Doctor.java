package com.cqust.Entity;

public class Doctor {
    private int DoctorId;
    private String DoctorNum;
    private String DoctorName;
    private String DoctorAge;
    private String DoctorSex;
    private String Position;
    //一个医生属于一个科室
    private Department department;

    @Override
    public String toString() {
        return "Doctor{" +
                "DoctorId=" + DoctorId +
                ", DoctorNum='" + DoctorNum + '\'' +
                ", DoctorName='" + DoctorName + '\'' +
                ", DoctorAge='" + DoctorAge + '\'' +
                ", DoctorSex='" + DoctorSex + '\'' +
                ", Position='" + Position + '\'' +
                ", department=" + department +
                '}';
    }

    public int getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(int doctorId) {
        DoctorId = doctorId;
    }

    public String getDoctorNum() {
        return DoctorNum;
    }

    public void setDoctorNum(String doctorNum) {
        DoctorNum = doctorNum;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }

    public String getDoctorAge() {
        return DoctorAge;
    }

    public void setDoctorAge(String doctorAge) {
        DoctorAge = doctorAge;
    }

    public String getDoctorSex() {
        return DoctorSex;
    }

    public void setDoctorSex(String doctorSex) {
        DoctorSex = doctorSex;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
