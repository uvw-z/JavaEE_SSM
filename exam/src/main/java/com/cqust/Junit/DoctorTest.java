package com.cqust.Junit;

import com.cqust.Dao.DoctorMapper;
import com.cqust.Entity.Doctor;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DoctorTest {/*
    SqlSession session=MyBatisUntils.getSession();
    DoctorMapper mapper = session.getMapper(DoctorMapper.class);

    @Test
    public void findDoctorById(){
        Doctor d = mapper.findById(1);
        System.out.println(d);
    }
    @Test
    public void findDoctorById2(){
        Doctor d2=session.selectOne("com.cqust.Dao.DoctorMapper.findDoctorById",1);
        System.out.println(d2);
    }

    @Test
    public void findAll(){
        List<Doctor> list =mapper.findAll();
        for (Doctor doctors:list){
            System.out.println(doctors);
        }
    }

    @Test
    public void updateById(){
        Doctor doctor = new Doctor();
        doctor.setDoctorId(3);
        doctor.setDoctorNum("D202202");
        doctor.setDoctorName("Ryujin");
        doctor.setDoctorAge("44");
        doctor.setDoctorSex("female");
        doctor.setDepartment("外科de");
        doctor.setPosition("医师");
        int i = mapper.updateById(doctor);
        session.commit();
        if (i>0) {
            System.out.println("成功更新"+i+"条消息："+doctor);
        }else {
            System.out.println("更新失败");
        }
    }

    @Test
    public void Insert(){
        Doctor doctor = new Doctor();
        doctor.setDoctorNum("D202202");
        doctor.setDoctorName("Ryujin");
        doctor.setDoctorAge("44");
        doctor.setDoctorSex("female");
        doctor.setDepartment("外科");
        doctor.setPosition("医师");
        int i = mapper.insert(doctor);
        session.commit();
        if (i>0){
            System.out.println("成功插入"+i+"条消息："+doctor);
        }else {
            System.out.println("插入失败失败");
        }
    }
*/

}
