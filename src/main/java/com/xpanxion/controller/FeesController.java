package com.xpanxion.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xpanxion.model.Customer;
import com.xpanxion.model.Fees;
import com.xpanxion.model.Scheme;
import com.xpanxion.service.CustomerService;
import com.xpanxion.service.FeesService;
import com.xpanxion.service.SchemeService;
@Controller
public class FeesController {
	@Autowired
	private FeesService feesService;
	
	@Autowired
	private SchemeService schemeService;
	
	@Autowired
	private CustomerService customerService;
	public CustomerService getCustomerService() {
		return customerService;
	}


	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}


	public SchemeService getSchemeService() {
		return schemeService;
	}


	public void setSchemeService(SchemeService schemeService) {
		this.schemeService = schemeService;
	}


	public FeesService getFeesService() {
		return feesService;
	}


	public void setFeesService(FeesService feesService) {
		this.feesService = feesService;
	}


	@RequestMapping(value="/feesadd", method = RequestMethod.POST)
	public ModelAndView addFees(@ModelAttribute("fees") Fees fees, HttpServletRequest request){
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Front Desk Executive")){
		System.out.println("Controller " +fees+"\t" );
		Date date=Calendar.getInstance().getTime();
		System.out.println(date);
		fees.setDate(date.toString());
		 Formatter fmt = new Formatter();
	        Calendar cal = Calendar.getInstance();
	        fmt = new Formatter();
	        fmt.format("%tb", cal);
	        System.out.println(fmt);
	        fees.setMonth(fmt.toString());
		this.feesService.addFees(fees);;
		model.setViewName("fdeHome");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
		
	}
	
	
	@RequestMapping(value= "/Fees", method = RequestMethod.GET)
	public ModelAndView listScheme(HttpServletRequest request){
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Front Desk Executive")){
		List<Scheme> listScheme =this.schemeService.listScheme();
		List<Customer> listCustomer=this.customerService.listCustomer();
	        Fees fees=new Fees();
//	        ModelAndView model = new ModelAndView();
	        model.addObject("listScheme", listScheme);
	        model.addObject("listCustomer", listCustomer);
	        //System.out.println("ABABABABA DABBA Jabba="+listCustomer.size());
	        model.addObject("fees", fees);
	        //model.setViewName("Scheme");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	
	}

	@RequestMapping(value="/FeeRecord", method = RequestMethod.POST)
	public ModelAndView listFee(@ModelAttribute("fees") Fees fees, HttpServletRequest request){
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Front Desk Executive")|| request.getSession().getAttribute("role").equals("Customer")){
		System.out.println("Controller " +fees+"\t" );
		List<Fees> listFees=this.feesService.listFees(fees.getCustId());
//		ModelAndView model=new ModelAndView();
		//this.feesService.addFees(fees);;
		model.addObject("listFees",listFees);
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
		
	}
	
	
	
	@RequestMapping(value="/SearchCustomerSub", method = RequestMethod.GET)
	public ModelAndView listCustomer(HttpServletRequest request){
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Front Desk Executive")|| request.getSession().getAttribute("role").equals("Customer")){
		List<Customer> listCustomer=this.customerService.listCustomer();
	        Fees fees=new Fees();
//	        ModelAndView model = new ModelAndView();
	        model.addObject("listCustomer", listCustomer);
	        model.addObject("fees", fees);
	        //model.setViewName("Scheme");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	
	}
}
