package com.cqust.Controller;

import com.cqust.Biz.StudentBiz;
import com.cqust.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yxt
 * @Description:
 * @date 2022/11/2 15:20
 */
@Component
public class StudentController {
    @Autowired
    private StudentBiz studentBiz;

    public void studentEnroll(String sno, String name,String sex,String rno,String bno){
        Student s =new Student();
        s.setSno(sno);
        s.setName(name);
        s.setSex(sex);
        s.setRno(rno);
        s.setBno(bno);
        int i= studentBiz.enrollStudent(s);
        if (i ==1 ) {
            System.out.println("新生student住宿信息插入成功");
        }
        else {
            System.out.println("Student住宿信息插入失败");
        }
}

    public void search (String strWhere){
    if (studentBiz.queryStudent(strWhere)==1){
        System.out.println("查找student住宿信息成功！");
    }
}


}
