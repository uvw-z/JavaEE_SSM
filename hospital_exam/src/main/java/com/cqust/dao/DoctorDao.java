package com.cqust.dao;


import com.cqust.entity.Doctor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface DoctorDao {
    @Select("select* from doctor where DoctorId=#{DoctorId}")
    public Doctor findById(int DoctorId);

    @Select("select *from doctor")
    public List<Doctor> findAll();

    @Update("update doctor set DoctorId=#{DoctorId},DoctorNum=#{DoctorNum},DoctorName=#{DoctorName}," +
            "DoctorAge=#{DoctorAge},DoctorSex=#{DoctorSex},Department=#{Department},Position=#{Position}"+"where DoctorId=#{DoctorId}" )
    public int updateById(Doctor doctor);

    @Insert({"insert into doctor VALUES (#{DoctorId},#{DoctorNum},#{DoctorName},#{DoctorAge},#{DoctorSex}," +
            "#{Department},#{Position})"})
    public int insert(Doctor doctor);
}
