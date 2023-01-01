package com.cqust.Service.Impl;


import com.cqust.Dao.DoctorDao;
import com.cqust.Entity.Doctor;
import com.cqust.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorDao doctorDao;
    @Override
    public Doctor findById(Integer DoctorId) {
        return doctorDao.findById(1);
    }

    @Override
    public List<Doctor> findAll() {
        return doctorDao.findAll();
    }

    @Override
    public int updateById(Doctor doctor) {
        return 0;
    }

    @Override
    public int insert(Doctor doctor) {
        return 0;
    }
}
