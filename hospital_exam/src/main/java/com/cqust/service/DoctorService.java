package com.cqust.service;
import com.cqust.entity.Doctor;
import java.util.List;

public interface DoctorService {

    public Doctor findById(int DoctorId);
    public List<Doctor> findAll();
    public int updateById(Doctor doctor);
    public int insert(Doctor doctor);
}
