package com.cqust.Entity;


public class Record {
    private int rid;
    private int sid;
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

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
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
                ", sid=" + sid +
                ", consumeTime='" + consumeTime + '\'' +
                ", consumeType='" + consumeType + '\'' +
                ", consumeMoney='" + consumeMoney + '\'' +
                ", memo='" + memo + '\'' +
                ", consumePort='" + consumePort + '\'' +
                '}';
    }
}
