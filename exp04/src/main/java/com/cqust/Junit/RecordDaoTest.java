package com.cqust.Junit;

import com.cqust.Dao.CardDao;
import com.cqust.Dao.RecordDao;
import com.cqust.Dao.StudentDao;
import com.cqust.Entity.Card;
import com.cqust.Entity.Record;
import com.cqust.Entity.Student;
import com.sun.prism.impl.Disposer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class RecordDaoTest {
    @Test
    public void Insert(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        RecordDao recordDao = ac.getBean(RecordDao.class);
        Record record = new Record();
        record.setCid(2);
        record.setCno("2001");
        record.setConsumeType("consume");
        record.setConsumeMoney("20");
        record.setMemo("消费二十");
        record.setConsumePort("端口一");
        //执行insert方法
        int num=recordDao.insert(record);
        if (num >0 ) {
            System.out.println("增加一条record信息:");
            System.out.println( record);
        }else {
            System.out.println("插入record失败");
        }
    }


    @Test
    public void Update(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        RecordDao recordDao=ac.getBean(RecordDao.class);
        Record record = new Record();
        record.setRid(2);
        record.setCid(3);
        record.setCno("999999");

        //执行update方法
        int num = recordDao.update(record);
        if (num > 0) {
            System.out.println("修改record成功");
        }else {
            System.out.println("修改record失败");
        }
    }

    @Test
    public void Delete(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        RecordDao recordDao=ac.getBean(RecordDao.class);
        int num = recordDao.delete(5);
        if (num > 0) {
            System.out.println("删除record成功");
        }else {
            System.out.println("删除record失败");
        }
    }

    @Test
    public void selectById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        RecordDao recordDao=ac.getBean(RecordDao.class);

        Record record = recordDao.selectById(2);
        System.out.println("通过rid找到的record信息：" + record);
    }

    @Test
    public void selectByCno(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        RecordDao recordDao=ac.getBean(RecordDao.class);

        List<Record> recordList = recordDao.selectByCno(2001);
        System.out.println("此卡的消费记录：");
        for (Record record : recordList) {
            System.out.println(recordList);
        }

    }

    @Test
    public void selectAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        RecordDao recordDao=ac.getBean(RecordDao.class);
        List<Record> recordList=recordDao.selectAllCard();
        System.out.println("所有record信息：");
        for (Record record : recordList) {
            System.out.println(record);
        }
    }
    @Test
    public void RecordDaoSelectByCondition() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        RecordDao recordDao = (RecordDao)ac.getBean("recordDao");

        List<Record> lst =recordDao.selectByCondition("cno='2001'");
        System.out.println("此卡的所有消费记录：");
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
    }


}
