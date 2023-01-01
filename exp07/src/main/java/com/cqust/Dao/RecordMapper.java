package com.cqust.Dao;

import com.cqust.Entity.Record;
import com.cqust.Pojo.Orders;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface RecordMapper {
    //N:1
    @Select("select *from record where cid=#{cid}")
    public List<Orders> CardWithRecords(int cid);


    //CRUD
    @Select("select *from record where rid=#{rid}")
    public Record selectById(int rid);

    @Select("select *from record")
    public List<Record> selectAll();

    @Update(" update record set cid=#{cid},cno=#{cno},consumeType=#{consumeType}," +
            "consumeMoney=#{consumeMoney},memo=#{memo},consumePort=#{consumePort}" +
            " where rid =#{rid}")
    public int updateById(Record record);

    @Delete("delete from record where rid=#{rid}")
    public int deleteById(int rid);

    @Insert("insert into record VALUES (#{rid},#{cid},#{cno},NOW(),#{consumeType},#{consumeMoney},#{memo},#{consumePort}")
    public int insert(Record record);

}
