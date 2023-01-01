package com.cqust.Controller;
import com.cqust.Biz.RecordBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller
public class RecordController {
    @Autowired
    RecordBiz recordBiz;
    public void ConsumeRecordquery(String strWhere){
        if (recordBiz.queryConsumeRecord(strWhere)==1){
            System.out.println(strWhere+"记录查找成功(controller)");
        }
    }
}
