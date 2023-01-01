package com.cqust.Dao;

import com.cqust.Entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;



public interface UserDao {
    @Select({"select *from user where id=#{id}"})
    public User selectById(int id);

    @Insert("insert into user VALUES (#{id},#{name})")
    public int insert(User user);
}
