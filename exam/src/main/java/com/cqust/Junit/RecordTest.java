package com.cqust.Junit;

import com.cqust.Dao.RecordMapper;
import com.cqust.Entity.Record;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class RecordTest {
    /*

    SqlSession session= MyBatisUntils.getSession();
    RecordMapper mapper = session.getMapper(RecordMapper.class);

    @Test
    public void findRecordById(){
        Record record = mapper.findById(1);
        System.out.println(record);
    }

    @Test
    public void findAll(){
        List<Record> records =mapper.findAll();
        for (Record record:records){
            System.out.println(record);
        }
    }

 @Test
    public void updateById(){
        Record record = new Record();
        record.setRecordId(2);
        record.setPatientId(2);
        record.setRecordDate("2022");
        record.setPatientName("kmg");
        record.setCondition("咳嗽");
        int i = mapper.updateById(record);
        session.commit();
        if (i>0) {
            System.out.println("成功更新"+i+"条消息："+record);
        }else {
            System.out.println("更新失败");
        }
    }

    @Test
    public void insert(){
        Record record = new Record();
        record.setPatientId(2);
        record.setPatientName("kmg");
        record.setCondition("失眠");
        int i = mapper.insert(record);
        session.commit();
        if (i>0) {
            System.out.println("插入更新"+i+"条消息："+record);
        }else {
            System.out.println("插入失败");
        }
    }
*/
}
