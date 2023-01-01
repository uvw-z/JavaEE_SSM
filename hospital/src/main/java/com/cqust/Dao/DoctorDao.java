package com.cqust.Dao;

import com.cqust.Entity.Doctor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public interface DoctorDao {

    public Doctor findDoctorById(Integer DoctorId);

    @Select("select* from doctor where DoctorId=#{DoctorId}")
    public Doctor findById(int DoctorId);

    @Select("select *from doctor")
    public List<Doctor> findAll();

    @Update("update doctor set DoctorId=#{DoctorId},DoctorNum=#{DoctorNum},DoctorName=#{DoctorName}," +
            "DoctorAge=#{DoctorAge},DoctorSex=#{DoctorSex},Position=#{Position}"+"where DoctorId=#{DoctorId}" )
    public int updateById(Doctor doctor);

    @Insert({"insert into doctor VALUES (#{DoctorId},#{DoctorNum},#{DoctorName},#{DoctorAge},#{DoctorSex},#{Position})"})
    public int insert(Doctor doctor);

}


