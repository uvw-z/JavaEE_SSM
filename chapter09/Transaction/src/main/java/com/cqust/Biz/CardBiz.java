package com.cqust.Biz;

import com.cqust.Dao.CardDao;
import com.cqust.Dao.StudentDao;
import com.cqust.Entity.Card;
import com.cqust.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CardBiz {
    @Autowired
    private CardDao cardDao;
    private StudentDao studentDao;


//开卡
    public int openAccount(String sno,String name,String cno,float money){
        //是否有该学生
        String strWhere="sno='%s'";
        strWhere=String.format(strWhere,sno);

        List<Student> studentList = studentDao.selectByCondition(strWhere);
        if(studentList != null) {
            Card card = new Card();
            card.setSid(studentList.get(0).getSid());
            card.setSno(sno);
            card.setCno(cno);
            card.setName(name);
            card.setMoney(money);
            cardDao.insert(card);
            return cardDao.insert(card);
                }
        else
            return -1;
    }



    public int charge(String sno,float chg){
        //get card info by sno from db;
        return 1;
    }

    public int consume(String sno, float red){
        //get card info by sno from db;
            return 1;
    }


}


