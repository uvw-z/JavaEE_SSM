package com.cqust.Controller;

import com.cqust.Entity.Doctor;
import com.cqust.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DoctorController {
   @Autowired
    private DoctorService doctorService;

    @RequestMapping("/doctor")
    public ModelAndView findDoctorById(Integer DoctorId){
        //调用Service获取到数据
        Doctor doctor = doctorService.findDoctorById(DoctorId);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("doctor.jsp");
        modelAndView.addObject("doctor",doctor);

        return modelAndView;

    }
}
