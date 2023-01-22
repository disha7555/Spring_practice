package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.LoginVO;
import com.model.RegVO;

@Controller
public class DemoController {

	@RequestMapping(value = "reg1.html", method = RequestMethod.GET)
	public ModelAndView Load() {
		// System.out.println("hello...");
		return new ModelAndView("register", "RegVO", new RegVO());
	}

	@RequestMapping(value = "s.html", method = RequestMethod.GET)
	public ModelAndView Load1(@ModelAttribute RegVO v, HttpSession session) {
		session.setAttribute("data", v);
		return new ModelAndView("login", "LoginVO", new LoginVO());
	}

	@RequestMapping(value = "save.html", method = RequestMethod.GET)

	public ModelAndView save1(HttpSession session, @ModelAttribute LoginVO v1) {
		RegVO v = (RegVO) session.getAttribute("data");

		String un = v.getUn();
		String pw = v.getPw();
		String un1 = v1.getUn1();
		String pw1 = v1.getPw1();
		if (un.equals(un1) && pw.equals(pw1)) {
			return new ModelAndView("display", "key", v).addObject("key1", v1);
		}
		else 
		{
			return new ModelAndView("login", "LoginVO", new LoginVO());
		}
	}
}