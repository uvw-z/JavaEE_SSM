package com.cqust.Dao;

import com.cqust.Entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface StudentMapper {
    //1:1
    @Select("select *from student where sid=#{sid}")
    @Results({@Result(column = "sid",property = "card",  //column的值是 card表中的sid与student表关联
            one=@One(select = "com.cqust.Dao.CardMapper.StudentWithCard"))}
    )
    public Student selectStudentWithCard(int sid);

    //CRUD操作
    @Select({"select* from student where sid=#{id}"})
    public Student selectById(int sid);

    @Select("select *from student")
    public List<Student> selectAll();

    @Update("update student set sno=#{sno},name=#{name},age=#{age},major=#{major}"+"where sid=#{sid}" )
    public int updateById(Student student);

    @Delete("delete from student where sid=#{sid}")
    public int deleteById(int sid);

    @Insert("insert into student VALUES (#{sid},#{sno},#{name},#{age},#{major})")
    public int insert(Student student);

}
