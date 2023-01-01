package com.cqust.Junit;


import com.cqust.Entity.Record;

import com.cqust.Utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class RecordTest {

    SqlSession session = MyBatisUtils.getSession();

    @Test
    public void selectById() {
        Record r = session.selectOne("RecordMapper.selectById", 1);
        System.out.println("查找Record成功：" +r);
    }

    @Test
    public void SelectAll(){

        List<Record> list=session.selectList("RecordMapper.selectAll");
        for (Record record : list) {
            System.out.println(record);
        }
    }

    @Test
    public void Insert(){
        Record record=new Record();
        record.setCid(3);
        record.setCno("c01");
        record.setConsumeType("consume");
        record.setConsumeMoney("10");
        record.setMemo("RecordInsert添加");
        session.insert("RecordMapper.insert",record);
        session.commit();
        System.out.println("新增Record："+record);
    }

    @Test
    public void Delete(){
        session.delete("RecordMapper.delete",11);
        session.commit();
        System.out.println("删除Record成功");
    }

    @Test
    public void Update() {
        Record r = new Record();
        r.setRid(2);
        r.setCid(2);
        r.setMemo("RecordTest修改更新");
        r.setConsumePort("0");
        int i = session.update("RecordMapper.update", r);
        session.commit();
        if (i == 1) {
            System.out.println("更新Record成功");
        } else {
            System.out.println("更新record失败");
        }
    }

}