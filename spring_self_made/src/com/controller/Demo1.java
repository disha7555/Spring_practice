package com.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Demo1 {
@RequestMapping(value="hi.html",method=RequestMethod.GET)
public ModelAndView Load()
{
	System.out.println("hello...");
	String data="this is your file";
	return new ModelAndView("MSG","d",data);
}
}
