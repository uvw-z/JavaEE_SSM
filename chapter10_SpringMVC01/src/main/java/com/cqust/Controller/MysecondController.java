package com.cqust.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author yxt
 * @Description:
 * @date 2022/12/1 16:36
 */

@Controller
public class MysecondController {
    @RequestMapping("/mySecond")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("WEB-INF/jsp/myfistPage.jsp");
        return mv;
    }
}