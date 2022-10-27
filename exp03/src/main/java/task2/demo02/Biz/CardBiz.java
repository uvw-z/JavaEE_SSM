package task2.demo02.Biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import task2.demo02.Dao.CardDao;
import task2.demo02.Entity.Card;
@Component
public class CardBiz {
    @Autowired
    private CardDao cardDao;
    public void setCardDao(CardDao cardDao) {
        this.cardDao = cardDao;
    }
/*开卡*/
    public int openAccount(String sno,String name,String cno,float money){
        Card card = new Card();
        card.setName(name);
        card.setSno(sno);
        card.setCno(cno);
        card.setBalance(money);
        cardDao.insert(card);
        return 1;
    }
/*充值*/
    public int charge(String sno,float chg){
        //get card info by sno from db;
        Card card = cardDao.selectBySno(sno);
        //add money to card(balance);
        card.setBalance(card.getBalance()+chg);
        //sava(update) card info to db;
        cardDao.updateById(card);
        return 1;
    }
/*消费*/
    public int consume(String sno, float red){
        //get card info by sno from db;
        Card card = cardDao.selectBySno(sno);
        //delete money from card(balance);
        if (card.getBalance() > red){
            card.setBalance(card.getBalance() - red);
            //update card info to db;
            cardDao.updateById(card);
            return 1;
        }
        else {
            System.out.println("消费失败，余额不足。");
            return 0;
        }
    }


}


