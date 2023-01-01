package com.cqust.Entity;

public class Patient {
    private int PatientId;
    private String PatientNum;
    private String PatientName;
    private String PatientSex;
    private String PatientAge;
    private int DoctorId;
    private String DoctorName;
    private String PatientAdress;
    private String PatientPhone;
    //一个患者有多条就诊记录
    private Record records;

    @Override
    public String toString() {
        return "Patient{" +
                "PatientId=" + PatientId +
                ", PatientNum='" + PatientNum + '\'' +
                ", PatientName='" + PatientName + '\'' +
                ", PatientSex='" + PatientSex + '\'' +
                ", PatientAge='" + PatientAge + '\'' +
                ", DoctorId=" + DoctorId +
                ", DoctorName='" + DoctorName + '\'' +
                ", PatientAdress='" + PatientAdress + '\'' +
                ", PatientPhone='" + PatientPhone + '\'' +
                ", records=" + records +
                '}';
    }

    public int getPatientId() {
        return PatientId;
    }

    public void setPatientId(int patientId) {
        PatientId = patientId;
    }

    public String getPatientNum() {
        return PatientNum;
    }

    public void setPatientNum(String patientNum) {
        PatientNum = patientNum;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String patientName) {
        PatientName = patientName;
    }

    public String getPatientSex() {
        return PatientSex;
    }

    public void setPatientSex(String patientSex) {
        PatientSex = patientSex;
    }

    public String getPatientAge() {
        return PatientAge;
    }

    public void setPatientAge(String patientAge) {
        PatientAge = patientAge;
    }

    public int getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(int doctorId) {
        DoctorId = doctorId;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }

    public String getPatientAdress() {
        return PatientAdress;
    }

    public void setPatientAdress(String patientAdress) {
        PatientAdress = patientAdress;
    }

    public String getPatientPhone() {
        return PatientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        PatientPhone = patientPhone;
    }

    public Record getRecords() {
        return records;
    }

    public void setRecords(Record records) {
        this.records = records;
    }
}
