package com.cqust.test;

import com.cqust.dao.PatientDao;
import com.cqust.entity.Patient;
import com.cqust.service.PatientService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-service.xml",
        "classpath:application-dao.xml"})

public class PatientServiceTest {

    @Autowired
    private PatientService patientService;

    @Autowired
    private PatientDao patientDao;
    @Test
    public void findById() {
        Patient patient = patientService.findById(1);
        System.out.println(patient);
    }

    @Test
    public void findAll() {
        List<Patient> patientList = patientService.findAll();
        System.out.println(patientList);
    }

    @Test
    public void updateById() {
        Patient patient = new Patient();
        patient.setPatientId(2);
        patient.setPatientNum("2020444000");
        patient.setPatientName("Mingu");
        patient.setPatientSex("male");
        patient.setPatientAge("25");
        patient.setDoctorId(1);
        patient.setDoctorName("Yeji");
        patient.setPatientAdress("Street111");
        patient.setPatientPhone("13680992853");
        int i = patientService.updateById(patient);

        if (i>0) {
            System.out.println("成功更新"+i+"条消息："+patient);
        }else {
            System.out.println("更新失败");
        }
    }

    @Test
    public void insert() {
        Patient patient = new Patient();
        patient.setPatientNum("2020444000");
        patient.setPatientName("kmg");
        patient.setPatientSex("male");
        patient.setPatientAge("26");
        patient.setDoctorId(1);
        patient.setDoctorName("Hyeji");
        patient.setPatientAdress("Street111");
        patient.setPatientPhone("13680992883");
        int i = patientService.insert(patient);
        if (i>0){
            System.out.println("成功插入"+i+"条消息："+patient);
        }else {
            System.out.println("插入失败失败");
        }
    }

    @Test
    public void selectPatientWithRecords(){
        Patient patient = patientDao.selectPatientById(2);
        System.out.println(patient);
    }

}
