package com.cqust.Dao;

import com.cqust.Entity.Card;
import com.cqust.Entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CardMapper {
    //1:1
    @Select({"select *from card where sid=#{sid}"})
    public Card StudentWithCard(int sid);

    //1:N
    @Select("select *from card where cid=#{cid}")
    @Results({@Result(column = "cid" ,property = "recordList",
             many=@Many(select = "com.cqust.Dao.RecordMapper.CardWithRecords") ) }
             )
    public Card selectCardWithRecords(int cid);


    @Select({"select *from card where cid=#{cid}"})
    public Card selectById(int cid);

    @Select("select *from card")
    public List<Card> selectAll();

    @Update("update card set sid=#{sid},sno=#{sno},name=#{name},cno=#{cno},money=#{money},lastAccessTime=#{lastAccessTime}"
            +"where cid=#{cid}" )
    public int updateById(Card Card);

    @Insert("insert into card VALUES (#{cid},#{sid},#{sno},#{name},#{cno},#{money},#{lastAccessTime})")
    public int insert(Card Card);

    @Delete("delete from card where cid=#{cid}")
    public int deleteById(int cid);
}
