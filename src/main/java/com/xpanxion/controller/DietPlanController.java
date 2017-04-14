package com.xpanxion.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.xpanxion.model.DietPlan;
import com.xpanxion.service.DietPlanService;

@Controller
public class DietPlanController {
	@Autowired
	private DietPlanService dietPlanSevice;

	

	public DietPlanService getDietPlanSevice() {
		return dietPlanSevice;
	}

	public void setDietPlanSevice(DietPlanService dietPlanSevice) {
		this.dietPlanSevice = dietPlanSevice;
	}

	@RequestMapping(value = "/DietADDUPDATES", method = RequestMethod.POST)
	public ModelAndView addupdateDiet(DietPlan d, HttpServletRequest request) {
		ModelAndView model= new ModelAndView();
		//if(request.getSession().getAttribute("role").equals("Dietician")){
			System.out.println("Controller called");
		
		//ModelAndView m = new ModelAndView();
			// new Customer, add it
			this.dietPlanSevice.addDiet(d);
			model.setViewName("dieticianHome");
		//}
		//
			//model.setViewName("Error");
		return model;
	}

	@RequestMapping(value = "/redirectTolist")
	public ModelAndView listDiet(HttpServletRequest request) {
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Trainer")){
		System.out.println("Controller called for list");
		List<DietPlan> listDietPlan = dietPlanSevice.listDiet();
		//ModelAndView model = new ModelAndView();
		//model.setViewName("DieticianList");
		System.out.println(listDietPlan);
		model.setViewName("DietPlanList");
		model.addObject("listDiet", listDietPlan);
		model.addObject("listDiet2", listDietPlan);
		model.setViewName("TrainerDietUPDATE");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}
	
	

	@RequestMapping(value = "/DieticianADD", method = RequestMethod.GET)
	public void redirectToadd() {
	}

//	@RequestMapping(value = "/redirectToupdate", method = RequestMethod.GET)
//	public ModelAndView redirectToupdate() {
//		ModelAndView model = new ModelAndView();
//		model.setViewName("DietPlanUpdate");
//		return model;
//	}


}
