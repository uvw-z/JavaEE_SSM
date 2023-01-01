package com.cqust.Service;


import com.cqust.Entity.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DoctorService {
    public Doctor findById(Integer DoctorId);

    public List<Doctor> findAll();

    public int updateById(Doctor doctor);

    public int insert(Doctor doctor);

}
