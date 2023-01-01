package com.cqust.service;


import com.cqust.entity.Record;

import java.util.List;

public interface RecordService {

    public Record findById(int RecordId);

    public List<Record> findAll();

    public int updateById(Record record);

    public int insert(Record record);


    public int changeById(int RecordId,int PatientId,String RecordDate,String Condition);
}
