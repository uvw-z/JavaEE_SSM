package com.cqust.service.impl;


import com.cqust.dao.DoctorDao;
import com.cqust.entity.Doctor;
import com.cqust.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorDao doctorDao;

    @Override
    public Doctor findById(int DoctorId) {
        return doctorDao.findById(DoctorId);
    }

    @Override
    public List<Doctor> findAll() {
        return doctorDao.findAll();
    }

    @Override
    public int updateById(Doctor doctor) {
       return doctorDao.updateById(doctor);
    }

    @Override
    public int insert(Doctor doctor) {
        return doctorDao.insert(doctor);
    }
}
