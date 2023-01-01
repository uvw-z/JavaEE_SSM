package com.cqust.Service.Impl;

import com.cqust.Dao.UserDao;
import com.cqust.Entity.User;
import com.cqust.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Integer id) {
        System.out.println("findById方法，查找用户信息");
        return userDao.selectById(id);
    }
}
