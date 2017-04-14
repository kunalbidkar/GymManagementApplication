package com.xpanxion.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.xpanxion.service.DurationService;
import com.xpanxion.model.Duration;

@Controller
public class DurationController {

	@Autowired
	private DurationService durationService;

	public void setDurationService(DurationService durationService) {
		this.durationService = durationService;
	}
	@RequestMapping(value= "/duration", method = RequestMethod.POST)
	public ModelAndView addWorkoutType(@ModelAttribute("duration") Duration d, HttpServletRequest request){
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Admin")){
			System.out.println("WorkoutType"+d.getDurationPlan());
		
		/*System.out.println(e.getRoles().getRoleId());*/
		System.out.println("In Controller "+d);
			this.durationService.addDuration(d);;
			model.setViewName("adminHome");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}
	@RequestMapping(value = "/deleteDuration", method = RequestMethod.POST)
    public String deleteCustomer(@ModelAttribute("Duration") Duration duration) {
		
		System.out.println("Controller!@!##@!#!@#!");
		System.out.println(duration.getDurationId());
          this.durationService.deleteDuration(duration);
          return "redirect:/adminHome";
    }
	
	
	@RequestMapping(value="/DeleteDuration", method= RequestMethod.GET)
    public ModelAndView listDuration(HttpServletRequest request) {
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Admin")){
			System.out.println("Controller called for list");
		
        List<Duration> listDuration =this.durationService.listDuration();
        System.out.println("Control returned from service list");
       // ModelAndView model = new ModelAndView();
        model.addObject("listDuration", listDuration);
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
			return model;
	}
}
