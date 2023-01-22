package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoControler {

	@RequestMapping(value="hello1.html",method = RequestMethod.GET)
	public ModelAndView Load()
	{
		System.out.println("controller");
		String m ="This Is Spring Demo::::::";
		return new ModelAndView("SP","msg",m);
		
	}
}
