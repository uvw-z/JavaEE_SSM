package com.cqust.Biz;

import com.cqust.Dao.CardDao;
import com.cqust.Dao.StudentDao;
import com.cqust.Entity.Card;
import com.cqust.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
public class CardBiz {
    @Autowired
    private CardDao cardDao;
    @Autowired
    private StudentDao studentDao;
    @Autowired
    JdbcTemplate jdbcTemplate;
    //开卡
    public int openAccount(String sno,String name,String cno,float money){
        //是否有该学生
        String strWhere="sno=";
       // strWhere=String.format(strWhere,sno);
        strWhere=strWhere +sno;
        List<Student> studentList = studentDao.selectByCondition(strWhere);
        if(studentList != null) {
            Card card = new Card();
            card.setSid(studentList.get(0).getSid());
            card.setSno(sno);
            card.setCno(cno);
            card.setName(name);
            card.setMoney(money);
            cardDao.insert(card);
            return 1;
        }
        else
            return -1;
    }

    //充值
    public int charge(String sno,float chg){
        Card card = cardDao.selectBySno(sno);
        card.setMoney(card.getMoney()+chg);
        cardDao.update(card);
        return 1;
    }
    //消费 /*这里事务没有进行数据库数据更新是因为card.update的问题*/
    public int consume(String sno, float red){
        Card card = cardDao.selectBySno(sno);
        if (card.getMoney() > red){
            card.setMoney(card.getMoney() - red);
            cardDao.update(card);
            return 1;
        }
        else {
            System.out.println("消费失败，余额不足。");
            return 0;
        }
    }


    /*查询余额*/
    public int queryMoney(String sno){
        Card card =cardDao.selectBySnoforMoney(sno);
        if (card.getSno()!=null){
            cardDao.selectBySnoforMoney(sno);
            System.out.println("通过sno查找余额，"+" sno："  +card.getSno()+ " "+"余额 "+card.getMoney());
            return 1;
        }
        else {
            System.out.println("查找余额失败");
            return 0;
        }
    }


    public int transfer(String outStudent,String InStudent,float dollar){
        jdbcTemplate.update("update card set money = money -? where name=?",dollar,outStudent);
        jdbcTemplate.update("update card set money=money + ? where name=?",dollar,InStudent);
        return 1;
    }

    public int consumeTransaction(String sno,float consumeMoney){
        jdbcTemplate.update("update card set money=money-? where sno=?",consumeMoney,sno);
        return 1;
    }

    public int chargeTransaction(String sno,float chargeMoney){
        jdbcTemplate.update("update card set money=money+? where sno=?",chargeMoney,sno);
        return 1;
    }

}


