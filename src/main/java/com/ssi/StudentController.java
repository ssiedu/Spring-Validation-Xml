package com.ssi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	Student student;
	String skills[]={"Java","Oracle","Php","DotNet"};
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(df,false));
	}
	
	@RequestMapping("studententry")
	public ModelAndView showStudentEntry() throws ParseException{
		ModelAndView mv=new ModelAndView("studententry");
		student= new Student();
		student.setStudentName("Manoj");
		student.setStudentHobby("Dance");
		student.setStudentMobile(9826656565L);
		student.setStudentDOB(new SimpleDateFormat("dd/MM/yyyy").parse("02/06/1989"));
		student.setStudentEmail("manoj@gmail.com");
		student.getStudentAddress().setHouseNo(121);
		student.getStudentAddress().setStreet("ABROAD");
		student.getStudentAddress().setCity("Indore");
		mv.addObject("student",student);
		mv.addObject("skills", skills);
		return mv;
	}
	@RequestMapping("register")
	public ModelAndView showSuccess(@ModelAttribute("student") Student student, BindingResult binder){
		if(binder.hasErrors()){
			ModelAndView mv=new ModelAndView("studententry");
			mv.addObject("skills", skills);
			return mv;
		}
		ModelAndView mv=new ModelAndView("confirm");
		return mv;
	}
}
