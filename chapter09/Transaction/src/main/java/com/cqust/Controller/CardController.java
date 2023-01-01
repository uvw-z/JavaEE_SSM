package com.cqust.Controller;

import com.cqust.Biz.CardBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CardController {
    @Autowired
    private CardBiz cardBiz;
    public void openAccount(String sno, String name, String cno, float money){
        if (cardBiz.openAccount(sno, name, cno, money)==1){
            System.out.println(sno+name+"开卡成功！");
        }
        else {
            System.out.println("开卡失败");
        }
    }

    public void charge(String sno, float addmoney){
        if (cardBiz.charge(sno,addmoney)==1) {
            System.out.println(sno+"充值："+addmoney);
        }
    }

    public void consume(String sno, float redmoney){
        if (cardBiz.consume(sno,redmoney)==1){
            System.out.println(sno+"消费："+redmoney);
        }
    }

    public void queryMoney(String sno){
        if (cardBiz.queryMoney(sno)==1){
            System.out.println(sno+"记录查找成功(controller)");
        }
    }


}

