package com.cqust.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyfirstController {

    @RequestMapping("/myFirst")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("WEB-INF/jsp/myfistPage.jsp");
        return mv;
    }
}
