package com.cqust.service;

import com.cqust.dao.StudentDao;
import com.cqust.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//Business logical check
@Component
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public int enrollStudent(Student s){
        //Business logical check 业务逻辑
        if(s.getAge()>13){
            studentDao.insert(s);
        }
        else {
            System.out.println("age is not valid!!");
            return -1;
        }
        return 1;
    }
}
