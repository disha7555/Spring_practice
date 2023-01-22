package com.controller;
import javax.servlet.http.*;
import com.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
@RequestMapping(value="reg.html",method=RequestMethod.GET)
public ModelAndView Load()
{
	//System.out.println("hello...");
	return new ModelAndView("register","RegVO",new RegVO());
}


@RequestMapping(value="save.html",method=RequestMethod.GET)

public ModelAndView save(@ModelAttribute RegVO v)
{
	System.out.println(v.getFn());
	System.out.println(v.getLn());
	return new ModelAndView("display","key",v);
}
}