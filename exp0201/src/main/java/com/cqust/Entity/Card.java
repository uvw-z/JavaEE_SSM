package com.cqust.Entity;

import org.springframework.stereotype.Component;

@Component
public class Card {
    private int id;
    private String name;
    private String sno;
    private String cno;
    private float balance;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSno() {
        return sno;
    }
    public void setSno(String sno) {
        this.sno = sno;
    }
    public String getCno() {
        return cno;
    }
    public void setCno(String cno) {
        this.cno = cno;
    }
    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sno='" + sno + '\'' +
                ", cno='" + cno + '\'' +
                ", balance=" + balance +
                '}';
    }
}
