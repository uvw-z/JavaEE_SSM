package com.cqust;


import com.cqust.Dao.DoctorDao;
import com.cqust.Entity.Doctor;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test {
public static void main(String[]args)throws Exception{
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sqlSessionFactory.openSession();

        DoctorDao doctorDao = session.getMapper(DoctorDao.class);

        Doctor doctor = doctorDao.findById(1);
        System.out.println(doctor);

        }

}
