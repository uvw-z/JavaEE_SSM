package com.cqust.Controller;

import com.cqust.Biz.CardBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CardController {
    @Autowired
    private CardBiz cardBiz;

    public void setCardBiz(CardBiz cardBiz) {
        this.cardBiz = cardBiz;
    }


    public void charge(String sno, float addmoney){
        if (cardBiz.charge(sno,addmoney)==1) {
            System.out.println("充值："+addmoney);
        }
    }

    public void consume(String sno, float redmoney){
        if (cardBiz.consume(sno,redmoney)==1){
            System.out.println("消费："+redmoney);
        }
    }
    public void openAccount(String sno, String name, String cno, float money){
        if (cardBiz.openAccount(sno, name, cno, money)==1){
            System.out.println("注册成功！"+name);
        }
    }

}
