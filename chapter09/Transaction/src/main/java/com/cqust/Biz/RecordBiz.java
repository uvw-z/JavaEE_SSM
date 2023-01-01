package com.cqust.Biz;

import com.cqust.Dao.RecordDao;
import com.cqust.Entity.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RecordBiz {
    @Autowired
    RecordDao recordDao;
    public int queryConsumeRecord(String strWhere){
        List<Record> rl=recordDao.selectByCondition(strWhere);
        if (rl != null) {
            System.out.println("消费记录：");
                System.out.println(rl);
            return 1;
        }
        else {
            System.out.println("查找消费记录失败");
            return 0;
        }
    }

}
