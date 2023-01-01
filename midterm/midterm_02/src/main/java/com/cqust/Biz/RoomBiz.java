package com.cqust.Biz;

import com.cqust.Dao.RoomDao;
import com.cqust.Entity.Room;
import com.cqust.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yxt
 * @Description:
 * @date 2022/11/2 16:06
 */
@Component
public class RoomBiz {
    @Autowired
    private RoomDao roomDao;

    public int queryRoom(int rid){
        Room room =roomDao.selectById(rid);
        if (room.getRno()!=null){
            roomDao.selectById(rid);
            System.out.println("查找宿舍Room成功");
            System.out.println(room);
            return 1;
        }
        else {
            System.out.println("查找宿舍Room失败");
            return 0;
        }

    }
}
