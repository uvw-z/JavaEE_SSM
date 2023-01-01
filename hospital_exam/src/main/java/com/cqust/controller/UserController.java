package com.cqust.controller;


import com.cqust.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;

public class UserController {
    //Pojo类型数据：User

    @RequestMapping("/registerUser")
    public void registerUser(User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        System.out.println("username=" + username + ",password=" + password);
    }
}
