package com.cqust.Dao;
import com.cqust.Entity.Card;
import com.cqust.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CardDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int insert(Card card){
        String strSql="select *from card ORDER BY cid DESC LIMIT 1";
        Object[] obj = new Object[]{
                card.getSid(),
                card.getSno(),
                card.getName(),
                card.getCno(),
                card.getMoney(),
                card.getLastAccessTime()
        };


        RowMapper<Card> rm = new BeanPropertyRowMapper<>(Card.class);
        card = jdbcTemplate.queryForObject(strSql,rm);
        card.setCid(card.getCid());

        int num=this.jdbcTemplate.update(strSql, obj);
        return num;
    }

    public int update(Card card){
        String strSql = "update card set cno=? where cid=?";
        Object[] obj = new Object[] {
                card.getCno(),
                card.getCid()};
        int num = this.jdbcTemplate.update(strSql, obj);
        return num;
    }

    public int delete(int cid){
        String strSql = "delete from card where cid=?";
        int num = this.jdbcTemplate.update(strSql, cid);
        return num;
    }


    //查询一个
    public Card selectById(int cid){
        String strSql="Select * from card where cid= ?";
        RowMapper<Card> rm =new BeanPropertyRowMapper<Card>(Card.class);
        return  this.jdbcTemplate.queryForObject(strSql,rm,cid);
    }

    //查询所有
    public List<Card> selectAllCard(){
        String strSql = "select * from card";
        RowMapper<Card> rm = new BeanPropertyRowMapper<>(Card.class);
        return this.jdbcTemplate.query(strSql, rm);
    }











}
