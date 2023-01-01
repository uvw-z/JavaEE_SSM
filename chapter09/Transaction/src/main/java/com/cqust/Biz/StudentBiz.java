package com.cqust.Biz;
import com.cqust.Dao.StudentDao;
import com.cqust.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StudentBiz {
    @Autowired
    StudentDao studentDao;

    public int enrollStudent(Student s){
        //Business logical check 业务逻辑
        if(s.getAge()>13 && s.getSno()!=null){
            studentDao.insert(s);
        }
        else {
            System.out.println("Student注册失败！！");
            return -1;
        }
        return 1;
    }
}
