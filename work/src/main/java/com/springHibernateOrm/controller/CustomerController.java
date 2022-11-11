package com.springHibernateOrm.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.springHibernateOrm.dao.CustomerDao;
import com.springHibernateOrm.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

	@Autowired
	private CustomerDao dao;
	
	@RequestMapping("/sayHello")
	public ModelAndView HelloPage() {

		ModelAndView mv = new ModelAndView("hello");
		return mv;
	}

	@RequestMapping("/inputForm")
	public ModelAndView customerInput() {
		ModelAndView mv = new ModelAndView("input");
		return mv;
	}

	@RequestMapping("/saveCustomer")
	public ModelAndView saveCustomer(HttpServletRequest request) throws ParseException {
		
		Customer cm = new Customer();
		try {
		cm.setCid(request.getParameter("c_id"));
		cm.setCname(request.getParameter("c_name"));
		cm.setCaddress(request.getParameter("c_address"));
		/*
		 * String date = request.getParameter("date"); SimpleDateFormat sfd = new
		 * SimpleDateFormat("MM/dd/yyyy"); Date joiningdate = sfd.parse(date);
		 */
		Date joiningdate = new Date();
		cm.setPoints(Integer.parseInt(request.getParameter("c_points")));
		cm.setShop_date(joiningdate);
		dao.saveCustomer(cm);
		}catch(Exception e)
		{System.out.println(e);}
		ModelAndView mv = new ModelAndView("csuccess");
		return mv;
	}

}
