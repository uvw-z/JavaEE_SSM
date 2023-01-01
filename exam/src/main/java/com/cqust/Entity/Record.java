package com.cqust.Entity;

public class Record {
    private int RecordId;
    private int PatientId;
    private String PatientName;
    private String RecordDate;
    private String Condition;

    @Override
    public String toString() {
        return "Record{" +
                "RecordId=" + RecordId +
                ", PatientId=" + PatientId +
                ", PatientName='" + PatientName + '\'' +
                ", RecordDate='" + RecordDate + '\'' +
                ", Condition='" + Condition + '\'' +
                '}';
    }

    public int getRecordId() {
        return RecordId;
    }

    public void setRecordId(int recordId) {
        RecordId = recordId;
    }

    public int getPatientId() {
        return PatientId;
    }

    public void setPatientId(int patientId) {
        PatientId = patientId;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String patientName) {
        PatientName = patientName;
    }

    public String getRecordDate() {
        return RecordDate;
    }

    public void setRecordDate(String recordDate) {
        RecordDate = recordDate;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }
}
