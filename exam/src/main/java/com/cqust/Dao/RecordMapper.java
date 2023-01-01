package com.cqust.Dao;


import com.cqust.Entity.Record;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface RecordMapper {

    @Select("select* from record where RecordId=#{RecordId}")
    public Record findById(int RecordId);

    @Select("select *from record")
    public List<Record> findAll();

    @Update("update record set RecordId=#{RecordId},PatientId=#{PatientId},PatientName=#{PatientName}," +
            "RecordDate=#{RecordDate},Condition=#{Condition}"+" where RecordId=#{RecordId}" )
    public int updateById(Record record);

    @Insert("insert into record VALUES (#{RecordId},#{PatientId},#{PatientName},NOW(),#{Condition})")
    public int insert(Record record);
}
