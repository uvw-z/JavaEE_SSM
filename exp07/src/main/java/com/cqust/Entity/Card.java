package com.cqust.Entity;

import java.util.List;

public class Card {
    private int cid;
    private int sid;
    private String sno;
    private String name;
    private String cno;
    private float money;
    private String lastAccessTime;
    //1对多
    private List<Record> recordList;

    @Override
    public String toString() {
        return "Card{" +
                "cid=" + cid +
                ", sid=" + sid +
                ", sno='" + sno + '\'' +
                ", name='" + name + '\'' +
                ", cno='" + cno + '\'' +
                ", money=" + money +
                ", lastAccessTime='" + lastAccessTime + '\'' +
                ", recordList=" + recordList +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
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

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(String lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    public List<Record> getRecordList() {
        return recordList;
    }

    public void setRecordList(List<Record> recordList) {
        this.recordList = recordList;
    }
}
