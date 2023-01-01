package com.cqust.controller;

import com.cqust.dao.PatientDao;
import com.cqust.entity.Patient;
import com.cqust.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PatientController {

    @Autowired
    private PatientService patientService;

    @Autowired
    private PatientDao patientDao;


    @RequestMapping("/patient")
    public ModelAndView findPatientById(Integer id) {
        Patient patient = patientDao.selectPatientById(id);
        //Patient patient = patientService.findById(id)
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("patient");
        modelAndView.addObject("patient",patient);
        return modelAndView;
    }
}
