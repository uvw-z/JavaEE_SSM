package com.cqust.Entity;

public class Bed{
    private int bid;
    private String bno;
    private int rid;
    private String rno;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBno() {
        return bno;
    }

    public void setBno(String bno) {
        this.bno = bno;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "bid=" + bid +
                ", bno='" + bno + '\'' +
                ", rid=" + rid +
                ", rno='" + rno + '\'' +
                '}';
    }
}
