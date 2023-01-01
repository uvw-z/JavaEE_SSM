package com.cqust.service;


import com.cqust.entity.Patient;

import java.util.List;

public interface PatientService {

    public Patient findById(int PatientId);

    public List<Patient> findAll();

    public int updateById(Patient patient);

    public int insert(Patient patient);

}
