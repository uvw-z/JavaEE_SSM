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
/*        String strSql="insert into card(sid,sno,name,cno,money,lastAccessTime)VALUE(?,?,?,?,?,NOW())";
        Object[] obj = new Object[]{
                card.getSid(),
                card.getSno(),
                card.getName(),
                card.getCno(),
                card.getMoney(),
        };
        int num=this.jdbcTemplate.update(strSql, obj);
        return num;*/

        String strSQL="insert into student(sid,sno,name,cno,money,lastAccessTime)VALUE(%d,'%s','%s','%s','%s',NOW())";
        strSQL=String.format(strSQL,
                card.getSid(),
                card.getSno(),
                card.getName(),
                card.getCno(),
                card.getMoney());
        jdbcTemplate.execute(strSQL);
        strSQL="select * from card order by cid desc limit 1";
        RowMapper<Card> rm = new BeanPropertyRowMapper<>(Card.class);
        Card c=jdbcTemplate.queryForObject(strSQL,rm);
        card.setCid(c.getCid());
        return c.getCid();
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
