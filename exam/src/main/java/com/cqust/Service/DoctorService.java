package com.cqust.Service;

import com.cqust.Entity.Doctor;
import org.springframework.stereotype.Service;

@Service
public interface DoctorService {
    public Doctor findDoctorById(Integer DoctorId);

}
