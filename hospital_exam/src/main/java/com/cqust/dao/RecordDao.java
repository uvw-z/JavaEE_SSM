package com.cqust.dao;


import com.cqust.entity.Record;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface RecordDao {

    @Select("select* from record where RecordId=#{RecordId}")
    public Record findById(int RecordId);

    @Select("select *from record")
    public List<Record> findAll();

    @Update("update record set RecordId=#{RecordId},PatientId=#{PatientId},PatientName=#{PatientName}," +
            "RecordDate=#{RecordDate},Condition=#{Condition} " +" where RecordId=#{RecordId} " )
    public int updateById(Record record);

    @Insert("insert into record VALUES (#{RecordId},#{PatientId},#{PatientName},NOW(),#{Condition})")
    public int insert(Record record);

    //关系映射
    @Select("select * from record where PatientId=#{PatientId}")
    public List<Record> selectRecordsByPatientId(int PatientId);


}
