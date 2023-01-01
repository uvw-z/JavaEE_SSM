package com.cqust.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyfirstController {

    @RequestMapping("/myFirst")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","this is msg");
        mv.setViewName("myfistPage");
        return mv;
    }
}
