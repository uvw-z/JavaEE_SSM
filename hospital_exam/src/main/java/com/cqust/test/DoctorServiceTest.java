package com.cqust.test;


import com.cqust.entity.Doctor;
import com.cqust.service.DoctorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-service.xml",
        "classpath:application-dao.xml"})
public class DoctorServiceTest {

    @Autowired
    private DoctorService doctorService;

    @Test
    public void findById() {
        Doctor doctor = doctorService.findById(1);
        System.out.println(doctor);
    }

    @Test
    public void findAll() {
        List<Doctor> doctorList = doctorService.findAll();
        System.out.println(doctorList);
    }

    @Test
    public void updateById() {
        Doctor doctor = new Doctor();
        doctor.setDoctorId(3);
        doctor.setDoctorNum("D202202");
        doctor.setDoctorName("Yuna");
        doctor.setDoctorAge("55");
        doctor.setDoctorSex("female");
        doctor.setDepartment("外科");
        doctor.setPosition("医师");
        int i = doctorService.updateById(doctor);

        if (i > 0) {
            System.out.println("成功更新"+i+"条消息："+doctor);
        }else {
            System.out.println("更新失败");
        }

    }

    @Test
    public void insert() {
        Doctor doctor = new Doctor();
        doctor.setDoctorNum("D202205");
        doctor.setDoctorName("Slz");
        doctor.setDoctorAge("44");
        doctor.setDoctorSex("female");
        doctor.setDepartment("眼科");
        doctor.setPosition("医师");
        int i = doctorService.insert(doctor);
        if (i>0){
            System.out.println("成功插入"+i+"条消息："+doctor);
        }else {
            System.out.println("插入失败失败");
        }
    }


}
