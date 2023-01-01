package com.cqust.Junit;

import com.cqust.Dao.CardMapper;
import com.cqust.Dao.StudentMapper;
import com.cqust.Entity.Card;
import com.cqust.Entity.Student;
import com.cqust.Pojo.Person;
import com.cqust.Pojo.Users;
import com.cqust.Utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyBatisTest {
    SqlSession session = MyBatisUtils.getSession();

    StudentMapper studentMapper = session.getMapper(StudentMapper.class);
    CardMapper cardMapper = session.getMapper(CardMapper.class);
    //一对一
    @Test
    public void findPersonById(){
        Person person = session.selectOne("com.cqust.mapper.PersonMapper.findPersonById",1);
        System.out.println(person);
    }
    @Test
    public void selectStudentWithCard(){
        Student s = studentMapper.selectStudentWithCard(1);
        System.out.println(s);
    }

    //一对多
    @Test
    public void findUserWithOrders(){
        Users user=session.selectOne("com.cqust.mapper.UserMapper.findUserWithOrders",1);
        System.out.println(user);
    }

    @Test
    public void selectCardWithRecords(){
        Card card = cardMapper.selectCardWithRecords(1);
        System.out.println(card);
    }

}
