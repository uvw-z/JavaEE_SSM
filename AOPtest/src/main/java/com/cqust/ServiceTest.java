package com.cqust;

import com.cqust.Dao.UserDao;
import com.cqust.Entity.User;
import com.cqust.Service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.io.InputStream;


public class ServiceTest {

    @Autowired
    private UserService userService;
    @Test
    public void test() {

        User user = userService.findById(2);
        System.out.println(user);
    }

}
