package com.controller; 
import javax.servlet.http.*;  
  
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	@RequestMapping(value="hello.html",method = RequestMethod.GET)
	public ModelAndView Load()
	{
		
		return new ModelAndView("reg");
		
	}
	@RequestMapping(value="h.html",method = RequestMethod.GET)
	public ModelAndView Load1(HttpServletRequest request, HttpServletResponse response, HttpSession session)
	{
		String un=request.getParameter("un");
		String pw=request.getParameter("pw");
		String fn=request.getParameter("fn");
		String ln=request.getParameter("ln");
		 session=request.getSession();  
		 session.setAttribute("fn",fn);  
		 session.setAttribute("ln",ln);  
	        session.setAttribute("un",un);  
	     
	        session.setAttribute("pw",pw);  
		return new ModelAndView("login");
	
		
	}
	@RequestMapping(value="h1.html",method = RequestMethod.GET)
	public ModelAndView Load2(HttpServletRequest request, HttpServletResponse response,HttpSession session)
	{
		String un1=request.getParameter("un1");
		String pw1=request.getParameter("pw1");
		 String fn=(String)session.getAttribute("fn");
		 String ln=(String)session.getAttribute("ln");
		 String un=(String)session.getAttribute("un");
		 String pw=(String)session.getAttribute("pw");
		if(un1.equals(un)&&pw1.equals(pw))
		{
	        
		return new ModelAndView("welcome","fn",fn).addObject("ln",ln);
		}
		else
		{
			return new ModelAndView("login");
		}
		}
		
	}

