package task2.demo01.Controller;
import task2.demo01.Biz.CardBiz;

public class CardController {
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
