package com.cqust.Dao;
import com.cqust.Entity.Card;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CardDao {

    public int insert(Card card){
        System.out.println("insert:"+card);
        return 1;
    }
    /**/
    public int deleteById(int id) {
        System.out.println("delete:"+ id);
        return 1;
    }
    public int updateById(Card card){
        System.out.println("update:"+card);
        return 1;
    }

    public Card selectById(int id){
        Card c=new Card();
        c.setId(id);
        return c;
    }
    public Card selectBySno(String sno){
//        System.out.println("selectBySno:"+sno);
        Card c=new Card();
        c.setSno(sno);
        return c;
    }
    public List<Card> selectByCondition(String strWhere){
        return null;
    }

}
