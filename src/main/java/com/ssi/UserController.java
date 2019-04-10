package com.ssi;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	   @RequestMapping(value = "/user", method = RequestMethod.GET)
	    public ModelAndView viewLogin(HttpServletRequest request) {
		    System.out.println(request.getSession().getServletContext().getInitParameter("admin"));
	        User user = new User();
	        ModelAndView mv=new ModelAndView("user");
	        mv.addObject("user", user);
	        return mv;
	    }
	 
	    @RequestMapping(value = "/login", method = RequestMethod.POST)
	    public ModelAndView doLogin(@Valid @ModelAttribute("user") User userForm,
	            BindingResult result) {
	 
	        if (result.hasErrors()) {
	        	ModelAndView mv1=new ModelAndView("user");
	            return mv1;
	        }
	        ModelAndView mv=new ModelAndView("success");
	        return mv;
	    }
} 