package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.RegDAO;
import com.model.RegVO;
@Controller
public class RegController {
@Autowired
RegDAO regDAO;

@RequestMapping(value = "load.html", method = RequestMethod.GET)
public ModelAndView Load() {

	return new ModelAndView("register_form", "RegVO", new RegVO());

}
@RequestMapping(value = "insert.html", method = RequestMethod.POST)
public ModelAndView Insert(@ModelAttribute RegVO regVo) {

	regDAO.insert(regVo);
	return new ModelAndView("result_insert");


}
}
