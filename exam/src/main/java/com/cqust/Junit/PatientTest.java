package com.cqust.Junit;


import com.cqust.Dao.PatientMapper;
import com.cqust.Entity.Patient;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
/*
public class PatientTest {

    SqlSession session= MyBatisUntils.getSession();
    PatientMapper mapper = session.getMapper(PatientMapper.class);

    @Test
    public void findPatientById(){
        Patient p= mapper.findById(1);
        System.out.println(p);
    }

    @Test
    public void findAll(){
        List<Patient> patients = mapper.findAll();
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }
    @Test
    public void updateById(){
        Patient patient = new Patient();
        patient.setPatientId(2);
        patient.setPatientNum("2020444000");
        patient.setPatientName("kmg");
        patient.setPatientSex("male");
        patient.setPatientAge("26");
        patient.setDoctorId(1);
        patient.setDoctorName("Hyeji");
        patient.setPatientAdress("Street111");
        patient.setPatientPhone("13680992853");
        int i = mapper.updateById(patient);
        session.commit();
        if (i>0) {
            System.out.println("成功更新"+i+"条消息："+patient);
        }else {
            System.out.println("更新失败");
        }
    }

    @Test
    public void Insert(){
        Patient patient = new Patient();
        patient.setPatientNum("2020444000");
        patient.setPatientName("kmg");
        patient.setPatientSex("male");
        patient.setPatientAge("26");
        patient.setDoctorId(1);
        patient.setDoctorName("Hyeji");
        patient.setPatientAdress("Street111");
        patient.setPatientPhone("13680992883");
        int i = mapper.insert(patient);
        session.commit();
        if (i>0){
            System.out.println("成功插入"+i+"条消息："+patient);
        }else {
            System.out.println("插入失败失败");
        }
    }



}
        */
