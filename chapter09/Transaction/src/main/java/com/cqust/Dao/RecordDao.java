package com.cqust.Dao;

import com.cqust.Entity.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RecordDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int insert(Record record){
        String strSql="insert into record(cid,cno,consumeTime,consumeType,consumeMoney,memo,ConsumePort)VALUE(?,?,NOW(),?,?,?,?)";
        Object[] obj = new Object[]{
            record.getCid(),
            record.getCno(),
            record.getConsumeType(),
            record.getConsumeMoney(),
            record.getMemo(),
            record.getConsumePort()
        };

        int num=this.jdbcTemplate.update(strSql, obj);
        return num;
    }

    public int update(Record record){
        String strSql = "update record set cid=?,cno=? where rid=?";
        Object[] obj = new Object[] {
                record.getCid(),
                record.getCno(),
                record.getRid() };
        int num = this.jdbcTemplate.update(strSql, obj);
        return num;
    }

    public int delete(int rid){
        String strSql = "delete from record where rid=?";
        int num = this.jdbcTemplate.update(strSql, rid);
        return num;
    }


    //查询一个
    public Record selectById(int rid){
        String strSql="Select * from record where rid= ?";
        RowMapper<Record> rm = new BeanPropertyRowMapper<Record>(Record.class);
        return this.jdbcTemplate.queryForObject(strSql,rm,rid);
    }

    //查询所有
    public List<Record> selectAllCard(){
        String strSql = "select * from record";
        RowMapper<Record> rm = new BeanPropertyRowMapper<>(Record.class);
        return this.jdbcTemplate.query(strSql, rm);
    }




}
