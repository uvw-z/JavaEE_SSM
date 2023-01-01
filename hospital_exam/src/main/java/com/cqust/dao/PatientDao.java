package com.cqust.dao;


import com.cqust.entity.Patient;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface PatientDao {
    @Select("select* from patient where PatientId=#{PatientId}")
    public Patient findById(int PatientId);

    @Select("select * from patient")
    public List<Patient> findAll();

    @Update("update patient set PatientId=#{PatientId},PatientNum=#{PatientNum},PatientName=#{PatientName}," +
            "PatientSex=#{PatientSex},PatientAge=#{PatientAge},DoctorId=#{DoctorId},DoctorName=#{DoctorName}," +
            " PatientAdress=#{PatientAdress},PatientPhone=#{PatientPhone}"
            +" where PatientId=#{PatientId}" )
    public int updateById(Patient patient);

    @Insert("insert into patient VALUES (#{PatientId},#{PatientNum},#{PatientName},#{PatientSex}," +
            "#{PatientAge},#{DoctorId},#{DoctorName},#{PatientAdress},#{PatientPhone})")
    public int insert(Patient patient);

    //关系映射
    @Select("select* from patient where PatientId=#{PatientId}")
    @Results({
            //数据库列名与实体类名称相同，省略
            @Result(property = "records",column = "PatientId",
                many = @Many(select = "com.cqust.dao.RecordDao.selectRecordsByPatientId"))
    })
    public Patient selectPatientById(int PatientId);

}
