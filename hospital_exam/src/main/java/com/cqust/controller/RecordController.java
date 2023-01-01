package com.cqust.controller;

import com.cqust.entity.Record;
import com.cqust.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RecordController {
    @Autowired
    private RecordService recordService;


    @RequestMapping("/record")
    public ModelAndView findRecordById(Integer id) {
        Record record = recordService.findById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("record");
        modelAndView.addObject("record",record);
        return modelAndView;
    }

}
