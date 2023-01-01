package com.cqust.Service;

import com.cqust.Dao.UserDao;
import com.cqust.Entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:mybatis-config.xml",
        "classpath:applicationContext.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;
    @Test
    public void findById() {

        User user = userService.findById(1);
        System.out.println(user);
    }


}