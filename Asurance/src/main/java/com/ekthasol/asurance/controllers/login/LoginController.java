package com.ekthasol.asurance.controllers.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ekthasol.asurance.models.Customer;
import com.ekthasol.asurance.service.login.LoginService;

@Controller
public class LoginController {
	
	
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "/getCustomer",method = RequestMethod.POST)
		public String getCustomer(@ModelAttribute("customer") Customer customer, HttpSession session, HttpServletResponse  response) {
			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
			Customer cust = null;
			try {
				cust = loginService.getCustomer(customer.getEmail(), customer.getPassword());
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			if(cust != null) {
				session.setAttribute("customer", cust);
				return ("success");
			}
			else{
				session.setAttribute("nopassword", "wrong password/email, try again!");
				return "redirect:/#/login";
			}
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	   public String redirect(HttpSession session) {
			session.invalidate();
	      return "redirect:/#/login";
	   }

}
