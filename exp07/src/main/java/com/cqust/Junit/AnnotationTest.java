package com.cqust.Junit;


import com.cqust.Dao.CardMapper;
import com.cqust.Dao.RecordMapper;
import com.cqust.Dao.StudentMapper;
import com.cqust.Entity.Card;
import com.cqust.Entity.Record;
import com.cqust.Entity.Student;
import com.cqust.Utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class AnnotationTest {
    SqlSession session = MyBatisUtils.getSession();
    StudentMapper studentMapper=session.getMapper(StudentMapper.class);

    @Test
    public void selectById(){
        Student s=studentMapper.selectById(1);
        System.out.println(s);
    }

    @Test
    public void selectAll(){
        List<Student> students = studentMapper.selectAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void update(){
        Student s = new Student();
        s.setSno("20010416");
        s.setName("yxt");
        s.setAge(21);
        s.setMajor("Software");
        s.setSid(1);
        int i = studentMapper.updateById(s);
        session.commit();
        if ( i>0) {
            System.out.println("成功更新"+i+"条信息："+s);
        }else {
            System.out.println("更新失败");
        }
    }

    @Test
    public void insert(){
        Student s = new Student();
        s.setSno("20010416");
        s.setName("yxt");
        s.setAge(21);
        s.setMajor("Software");
        studentMapper.insert(s);
        System.out.println(s);
    }

    @Test
    public void delete(){
        int i =studentMapper.deleteById(6);
        if (i > 0) {
            System.out.println("成功删除"+i+"条信息");
        }else {
            System.out.println("删除失败");
        }
        //session.commit();
    }


    //Card:
    @Test
    public void selectCardById(){
        CardMapper cardMapper = session.getMapper(CardMapper.class);
        Card card =  cardMapper.selectById(1);
        System.out.println(card);
    }

    //Record
    @Test
    public void selectRecordsAll(){
        RecordMapper recordMapper = session.getMapper(RecordMapper.class);
        List<Record> recordList = recordMapper.selectAll();
        for (Record record : recordList) {
            System.out.println(record);
        }
    }


}
