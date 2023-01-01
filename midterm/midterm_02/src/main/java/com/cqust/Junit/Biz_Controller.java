package com.cqust.Junit;

import com.cqust.Biz.RoomBiz;
import com.cqust.Controller.RoomController;
import com.cqust.Controller.StudentController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yxt
 * @Description:
 * @date 2022/11/2 15:24
 */
public class Biz_Controller {
    //新生注册
    @Test
    public void studentEnroll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentController sc =ac.getBean(StudentController.class);
        sc.studentEnroll("20010416008","Ryujin","female","A1","000012");
    }

    //查询住宿信息
    @Test
    public void query(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentController sc =ac.getBean(StudentController.class);
        sc.search("name='yxt'");
    }

    @Test
    public void queryRoom(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        RoomBiz rb =ac.getBean(RoomBiz.class);
        rb.queryRoom(1);

    }

    @Test
    public void queryRoom2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        RoomController rc =ac.getBean(RoomController.class);
        rc.search(2);
    }
}
