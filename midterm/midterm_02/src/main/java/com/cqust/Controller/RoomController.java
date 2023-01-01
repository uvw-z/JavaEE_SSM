package com.cqust.Controller;

import com.cqust.Biz.RoomBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yxt
 * @Description:
 * @date 2022/11/2 16:16
 */
@Component
public class RoomController {
    @Autowired
    private RoomBiz roomBiz;
    public void search (int rid){
       if (roomBiz.queryRoom(rid)==1){
           System.out.println("查找room成功");
       }
    }

}
