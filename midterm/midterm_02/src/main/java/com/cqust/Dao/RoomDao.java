package com.cqust.Dao;

import com.cqust.Entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yxt
 * @Description:
 * @date 2022/11/2 15:13
 */
@Repository
public class RoomDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int insert(Room room) {
        String strSql = "insert into room(rid,rno,site,type)VALUE(?,?,?,?)";
        Object[] obj = new Object[]{
                room.getRid(),
                room.getRno(),
                room.getSite(),
                room.getType()
        };
        int num = this.jdbcTemplate.update(strSql, obj);
        return num;
    }


    public int update(Room room) {
        String strSql = "update room set rno=? where rid=?";
        Object[] obj = new Object[]{
                room.getRno(),
                room.getRid()
        };
        int num = this.jdbcTemplate.update(strSql, obj);
        return num;
    }

    public int delete(int rid) {
        String strSql = "delete from room where rid=?";
        int num = this.jdbcTemplate.update(strSql, rid);
        return num;
    }

    //查询一个
    public Room selectById(int rid) {
        String strSql = "Select * from room where rid= ?";
        RowMapper<Room> rm = new BeanPropertyRowMapper<Room>(Room.class);
        return this.jdbcTemplate.queryForObject(strSql, rm, rid);
    }

    public Room selectBySno(String rno) {
        String strSql = "Select * from room where rno= ?";
        RowMapper<Room> rm = new BeanPropertyRowMapper<Room>(Room.class);
        return this.jdbcTemplate.queryForObject(strSql, rm, rno);
    }

    //查询所有
    public List<Room> selectAllRoom(){
        String strSql = "select * from room";
        RowMapper<Room> rm = new BeanPropertyRowMapper<>(Room.class);
        return this.jdbcTemplate.query(strSql, rm);
    }
}
