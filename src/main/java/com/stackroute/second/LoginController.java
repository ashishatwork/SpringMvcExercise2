package com.stackroute.second;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @RequestMapping("login")
    public ModelAndView login(HttpServletRequest req, HttpServletResponse res)
    {
        String username = req.getParameter("first");
        String password = req.getParameter("second");

        com.stackroute.second.User user = new com.stackroute.second.User(username, password);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Login");
        mv.addObject("name", username);
        return mv;
    }

}