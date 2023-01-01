package com.cqust.Dao;

import com.cqust.Entity.Patient;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import java.util.List;

public interface PatientMapper {
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



}
