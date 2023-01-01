package com.cqust.test;


import com.cqust.dao.RecordDao;
import com.cqust.entity.Record;
import com.cqust.service.RecordService;
import com.cqust.service.impl.RecordServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-service.xml",
        "classpath:application-dao.xml"})
public class RecordServiceTest {

    @Autowired
    private RecordService recordService;

    @Autowired
    private RecordDao recordDao;

    @Test
    public void findById() {
        Record record = recordService.findById(2);
        System.out.println(record);
    }

    @Test
    public void findAll() {
        List<Record> records = recordService.findAll();
        System.out.println(records);
    }

    @Test
    public void updateById() {
        Record record = new Record();
        record.setRecordId(1);
        record.setPatientId(1);
        record.setPatientName("Yeonjun");
        record.setRecordDate("2022-12-12");
        record.setCondition("咳嗽");

        int i = recordDao.updateById(record);

        if (i > 0) {
            System.out.println("成功更新" + i + "条消息：" + record);
        } else {
            System.out.println("更新失败");
        }
    }

    @Test
    public void insert() {
        Record record = new Record();
        record.setPatientId(2);
        record.setPatientName("Mingu");
        record.setCondition("擦伤");
        int i = recordService.insert(record);

        if (i > 0) {
            System.out.println("插入更新" + i + "条消息：" + record);
        } else {
            System.out.println("插入失败");
        }
    }

    //关联映射 1对多
    @Test
    public void selectByPatientId() {
        List<Record> records = recordDao.selectRecordsByPatientId(2);
        System.out.println(records);
    }

    //修改就诊信息业务逻辑
    @Test
    public void changeById() {
        if (recordService.changeById(5, 2, "2022-12-17", "擦伤444") == 1) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
    }


}

