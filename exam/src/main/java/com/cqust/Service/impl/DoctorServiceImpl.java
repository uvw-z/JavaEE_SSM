package com.cqust.Service.impl;

import com.cqust.Dao.DoctorMapper;
import com.cqust.Entity.Doctor;
import com.cqust.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public Doctor findDoctorById(Integer DoctorId) {
        return doctorMapper.findDoctorById(DoctorId);
    }
}
