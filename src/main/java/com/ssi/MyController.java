package com.ssi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {

	@RequestMapping("interestform")
	public String showDetailsForm(){
		return "details";
	}
	
	@RequestMapping("InterestCalculator")
	public ModelAndView calculate(@ModelAttribute("mybean") InterestBean bean){
		ModelAndView mv=new ModelAndView("showinterest");
		return mv;	
	}
	
}
