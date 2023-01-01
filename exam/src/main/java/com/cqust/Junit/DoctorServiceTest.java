package com.cqust.Junit;


import com.cqust.Dao.DoctorMapper;
import com.cqust.Entity.Doctor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-service.xml",
        "classpath:application-dao.xml"})
public class DoctorServiceTest {

    @Autowired
    private DoctorMapper doctorMapper;

    @Test
    public void findBookById(){
        Doctor doctor = doctorMapper.findDoctorById(1);
        System.out.println(doctor);
    }

}
