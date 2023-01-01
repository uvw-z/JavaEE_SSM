package com.cqust.controller;

import com.cqust.entity.Doctor;
import com.cqust.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DoctorController {

    @Autowired
    private DoctorService doctorService;


    @RequestMapping("/doctor")
    public ModelAndView findDoctorById(Integer id) {
        Doctor doctor = doctorService.findById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("doctor");
        modelAndView.addObject("doctor",doctor);
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/demo2")
    public String demo(){
        return "success";
    }
}
