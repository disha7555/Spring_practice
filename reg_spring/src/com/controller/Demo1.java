package com.controller;
import javax.servlet.http.*;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Demo1 {
@RequestMapping(value="reg1.html",method=RequestMethod.GET)
public ModelAndView Load()
{
	System.out.println("hello...");
	return new ModelAndView("reg");
}


@RequestMapping(value="save.html",method=RequestMethod.GET)

public ModelAndView save(HttpServletRequest request)
{
	String fn=request.getParameter("fn");
	String ln=request.getParameter("ln");
	return new ModelAndView("display","fn",fn).addObject("ln",ln);
}
}