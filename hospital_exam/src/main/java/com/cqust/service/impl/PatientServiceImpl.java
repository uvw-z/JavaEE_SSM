package com.cqust.service.impl;


import com.cqust.dao.PatientDao;
import com.cqust.entity.Patient;
import com.cqust.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientDao patientDao;

    @Override
    public Patient findById(int PatientId) {
        return patientDao.findById(PatientId);
    }

    @Override
    public List<Patient> findAll() {
        return patientDao.findAll();
    }

    @Override
    public int updateById(Patient patient) {
        return patientDao.updateById(patient);
    }

    @Override
    public int insert(Patient patient) {
        return patientDao.insert(patient);
    }
}
