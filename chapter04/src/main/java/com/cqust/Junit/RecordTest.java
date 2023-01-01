package com.cqust.Junit;


import com.cqust.Entity.Record;
import com.cqust.Untils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import org.junit.Test;
import java.util.List;

public class RecordTest {




    @Test
    public void selectById() {
        SqlSession session = MybatisUtils.getSession();
        Record r = session.selectOne("com.cqust.Entity.Record.selectById", 1);
        System.out.println("查找Record成功：" +r);
    }

    @Test
    public void SelectAll(){
        SqlSession session = MybatisUtils.getSession();
        List<Record> list=session.selectList("com.cqust.Entity.Record.selectAll");
        for (Record record : list) {
            System.out.println(record);
        }
    }

    @Test
    public void Insert(){
        SqlSession session = MybatisUtils.getSession();
        Record record=new Record();
        record.setCid(3);
        record.setCno("c01");
        record.setConsumeType("consume");
        record.setConsumeMoney("10");
        record.setMemo("RecordInsert添加");
        session.insert("com.cqust.Entity.Record.insert",record);
        session.commit();
        System.out.println("新增Record："+record);
    }

    @Test
    public void Delete(){
        SqlSession session = MybatisUtils.getSession();
        session.delete("com.cqust.Entity.Record.delete",11);
        session.commit();
        System.out.println("删除Record成功");
    }

    @Test
    public void Update() {
        SqlSession session = MybatisUtils.getSession();
        Record r = new Record();
        r.setRid(2);
        r.setCid(2);
        r.setMemo("RecordTest修改更新");
        r.setConsumePort("0");
        int i = session.update("com.cqust.Entity.Record.update", r);
        session.commit();
        if (i == 1) {
            System.out.println("更新Record成功");
        } else {
            System.out.println("更新record失败");
        }
    }

}