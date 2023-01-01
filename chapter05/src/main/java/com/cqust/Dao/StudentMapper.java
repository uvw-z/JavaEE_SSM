package com.cqust.Dao;

import com.cqust.Entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface StudentMapper {
    @Select("select* from student where sid=#{id}")
    public Student selectById(int sid);

    @Select("select *from student")
    public List<Student> selectAll();

    @Update("update student set sno=#{sno},name=#{name},age=#{age},major=#{major}"+"where sid=#{sid}" )
    public int updateById(Student student);

    @Insert("insert into student VALUES (#{sid},#{sno},#{name},#{age},#{major})")
    public int insert(Student student);
}
