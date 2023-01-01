package com.cqust.Biz;

import com.cqust.Dao.StudentDao;
import com.cqust.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yxt
 * @Description:
 * @date 2022/11/2 15:18
 */
@Component
public class StudentBiz {
    @Autowired
    StudentDao studentDao;
    public int enrollStudent(Student s){
        //Business logical check 业务逻辑
        if(s.getSno()!=null){
            studentDao.insert(s);
        }
        else {
            return -1;
        }
        return 1;
    }

    public int queryStudent(String strWhere){
        List<Student> Sl=studentDao.selectByCondition(strWhere);
        if (Sl != null) {
            System.out.println("学生住宿信息：");
            for (Student student : Sl) {
                System.out.println(student);
            }

            return 1;
        }
        else {
            System.out.println("查找学生住宿信息失败！");
            return 0;
        }
    }



}
