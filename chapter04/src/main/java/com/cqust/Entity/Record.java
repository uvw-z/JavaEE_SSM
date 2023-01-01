package com.cqust.Entity;


public class Record {
    private int rid;
    private int cid;
    private String cno;
    private String consumeTime;
    private String consumeType;
    private String consumeMoney;
    private String memo;
    private String consumePort;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime;
    }

    public String getConsumeType() {
        return consumeType;
    }

    public void setConsumeType(String consumeType) {
        this.consumeType = consumeType;
    }

    public String getConsumeMoney() {
        return consumeMoney;
    }

    public void setConsumeMoney(String consumeMoney) {
        this.consumeMoney = consumeMoney;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getConsumePort() {
        return consumePort;
    }

    public void setConsumePort(String consumePort) {
        this.consumePort = consumePort;
    }

    @Override
    public String toString() {
        return "Record{" +
                "rid=" + rid +
                ", cid=" + cid +
                ", cno='" + cno + '\'' +
                ", consumeTime='" + consumeTime + '\'' +
                ", consumeType='" + consumeType + '\'' +
                ", consumeMoney='" + consumeMoney + '\'' +
                ", memo='" + memo + '\'' +
                ", consumePort='" + consumePort + '\'' +
                '}';
    }
}
