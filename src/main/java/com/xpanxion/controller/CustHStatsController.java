package com.xpanxion.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.xpanxion.model.CustHStats;
import com.xpanxion.model.Customer;
import com.xpanxion.service.CustHStatsService;

@Controller
public class CustHStatsController {
	@Autowired
	private CustHStatsService statsServ;

	public CustHStatsService getStatsServ() {
		return statsServ;
	}

	public void setStatsServ(CustHStatsService statsServ) {
		this.statsServ = statsServ;
	}

	@RequestMapping(value = "/stats", method = RequestMethod.POST)
	public ModelAndView addStats(@ModelAttribute("custHStats") CustHStats chs, @Valid BindingResult result,
			SessionStatus status, HttpServletRequest request) {

		ModelAndView m= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Trainer")){
	
		System.out.println("Access denied");
		
		Date date = Calendar.getInstance().getTime();
		System.out.println(date);
		chs.setDate(date.toString());

		this.statsServ.addStats(chs);
		m.setViewName("trainerHome");
		}
		else{
				m.setViewName("Error");
				request.getSession().setAttribute("role","");
		}
		return m;
	}

	@RequestMapping(value = "/AddCustStats", method = RequestMethod.GET)
	public ModelAndView redirectTomappinghealthCust( HttpServletRequest request, CustHStats c) {
		System.out.println("In controller");
		ModelAndView models= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Trainer") || request.getSession().getAttribute("role").equals("Customer")){
		List<Customer> listcust = statsServ.listCustomerHealthStats();

		
		
		models.addObject("customerList", listcust);
		//models.setViewName("AddCustStats");
		}
		else{
			models.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return models;
	}

	@RequestMapping(value = "/ListHealthStats", method = RequestMethod.GET)
	public ModelAndView listCustomer(HttpServletRequest request,CustHStats c) {
		ModelAndView model = new ModelAndView();
		System.out.println("Controller called for list of health");
		if(request.getSession().getAttribute("role").equals("Trainer" )|| request.getSession().getAttribute("role").equals("Customer")){
		List<CustHStats> listcusthealth = this.statsServ.searchHealthStatsById(c.getCust_Id());

		model.addObject("listCustHStats", listcusthealth);
		model.setViewName("ListHealthStats");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;

	}

	@RequestMapping(value = "/healthSearchbyId")
	public ModelAndView listById(HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Trainer") || request.getSession().getAttribute("role").equals("Customer")){
		model.setViewName("listhealthById");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}

}
