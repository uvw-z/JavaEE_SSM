package com.cqust.WebPage;

import com.cqust.Dao.DoctorMapper;
import com.cqust.Entity.Doctor;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.InputStream;

public class MainTest {
    public static void main(String[] args) throws Exception{
/*
        SqlSession session = MyBatisUntils.getSession();
        DoctorMapper doctorMapper = session.getMapper(DoctorMapper.class);
        Doctor d = doctorMapper.findDoctorById(1);
        System.out.println(d);*/
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // InputStream is = Resources.getResourceAsStream("application-service.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sqlSessionFactory.openSession();

        DoctorMapper doctorMapper = session.getMapper(DoctorMapper.class);

        Doctor doctor = doctorMapper.findDoctorById(1);
        System.out.println(doctor);

    }
}
