package com.cqust.dao;

import com.cqust.entity.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import java.util.List;

//Dao:Database Access Object 数据库访问对象
/*CRUD
C:Creat,insert
R:Query,select
U:Update,update
D:Delete,delete
* */
//@Component
@Repository
public class StudentDao {
    public int insert(Student s){
        System.out.println("insert:"+s);
        return 1;
    }
    public List<Student> selectAll() {
        System.out.println("select All sutdents");
        return null;
    }
    public Student selectBySno(String sno){
        System.out.println("select by sno"+sno);
        return null;
    }
    public int update(Student s){
        System.out.println("update:"+s);
        return 1;
    }
    public int delete(int id){
        System.out.println("delete:"+id);
        return 1;
    }

}
