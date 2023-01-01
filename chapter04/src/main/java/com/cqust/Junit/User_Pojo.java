package com.cqust.Junit;

import com.cqust.Pojo.User;
import com.cqust.Untils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class User_Pojo {
    @Test
    public void findById(){
        SqlSession session= MybatisUtils.getSession();
        User user = session.selectOne("com.cqust.Pojo.User.findById",1);
        System.out.println(user);
    }

    @Test
    public void findUserById(){
        SqlSession session= MybatisUtils.getSession();
        User user = session.selectOne("com.cqust.Pojo.User.findUserById",1);
        System.out.println(user);
    }
}
