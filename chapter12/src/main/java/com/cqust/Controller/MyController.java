package com.cqust.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {
    @RequestMapping("/myfirst")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView();
        //mv.setViewName("MyFirstWebPage");
        mv.setViewName("MyFirstWebPage");
        return mv;
    }

}
