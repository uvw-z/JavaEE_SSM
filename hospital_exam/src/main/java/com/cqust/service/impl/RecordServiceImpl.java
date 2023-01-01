package com.cqust.service.impl;


import com.cqust.dao.RecordDao;
import com.cqust.entity.Record;
import com.cqust.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {

    @Autowired
    private RecordDao recordDao;

    @Override
    public Record findById(int RecordId) {
        return recordDao.findById(RecordId);
    }

    @Override
    public List<Record> findAll() {
        return recordDao.findAll();
    }

    @Override
    public int updateById(Record record) {
        return recordDao.updateById(record);
    }

    @Override
    public int insert(Record record) {
        return recordDao.insert(record);
    }

    @Override
    public int changeById(int RecordId,int PatientId,String RecordDate,String Condition) {
        Record record = recordDao.findById(RecordId);
        int i = record.getPatientId();
        if (i != 0) {
            record.setRecordId(RecordId);
            record.setPatientId(PatientId);
            record.setRecordDate(RecordDate);
            record.setCondition(Condition);
            return 1;
        }
        else
            return 0;
    }
}
