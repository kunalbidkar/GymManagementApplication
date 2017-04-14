package com.xpanxion.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xpanxion.model.WorkoutPlan;
import com.xpanxion.model.WorkoutType;
import com.xpanxion.service.WorkoutPlanService;
import com.xpanxion.service.WorkoutTypeService;


@Controller
public class WorkoutPlanController {
	@Autowired
	private WorkoutPlanService workoutPlanService;
	@Autowired
	private WorkoutTypeService workoutTypeService;
	public void setWorkoutPlanService(WorkoutPlanService workoutPlanService) {
		this.workoutPlanService = workoutPlanService;
	}
	@RequestMapping(value= "/workoutPlan", method = RequestMethod.POST)
	public ModelAndView addWorkoutPlan(@ModelAttribute("workoutPlan") WorkoutPlan w, HttpServletRequest request){
		
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Trainer")){
			System.out.println("WorkoutPlan"+w.getTrainingIntensity());
		/*System.out.println(e.getRoles().getRoleId());*/
		System.out.println("In Controller "+w);
			this.workoutPlanService.addWorkoutPlan(w);
			model.setViewName("trainerHome");
	}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}
	@RequestMapping(value= "/workoutPlanList", method = RequestMethod.GET)
	public ModelAndView viewWorkoutPlan(@ModelAttribute("workoutPlan") WorkoutPlan w){
	
		ModelAndView model= new ModelAndView();
		model.addObject("list", workoutPlanService.listWorkoutPlan());
		return model;
	
	}
	/*@RequestMapping(value = "/deleteWorkout", method = RequestMethod.POST)
    public String deleteWorkoutPlan(@ModelAttribute("WorkoutPlan") WorkoutPlan wPlan) {
		System.out.println("Controller#!@#@!#$");
          this.workoutPlanService.deleteWorkoutPlan(wPlan);
          return "redirect:/";
    }*/
	@RequestMapping(value="/AddWorkoutPlan", method= RequestMethod.GET)
    public ModelAndView listWorkoutType(HttpServletRequest request) {
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Trainer")){
            System.out.println("Controller called for list");
        List<WorkoutType> listWorkoutType =this.workoutTypeService.listWorkoutType();
        System.out.println("Control returned from service list");
        WorkoutPlan wPlan=new WorkoutPlan();
//        ModelAndView model = new ModelAndView();
        model.addObject("listWorkout", listWorkoutType);
        model.addObject("wplan", wPlan);
        model.setViewName("AddWorkoutPlan");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}
}
