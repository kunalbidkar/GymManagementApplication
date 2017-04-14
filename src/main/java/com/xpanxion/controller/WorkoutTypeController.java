package com.xpanxion.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xpanxion.model.WorkoutType;
import com.xpanxion.service.WorkoutTypeService;




@Controller
public class WorkoutTypeController {
	
	@Autowired
	private WorkoutTypeService workoutTypeService;
	

	public WorkoutTypeService getWorkoutTypeService() {
		return workoutTypeService;
	}

	public void setWorkoutTypeService(WorkoutTypeService workoutTypeService) {
		this.workoutTypeService = workoutTypeService;
	}

	@RequestMapping(value= "/workoutType", method = RequestMethod.POST)
	public ModelAndView addWorkoutType(@ModelAttribute("workoutType") WorkoutType w, HttpServletRequest request){
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Admin")){
		System.out.println("WorkoutType"+w.getWorkoutName());
		/*System.out.println(e.getRoles().getRoleId());*/
		System.out.println("In Controller "+this.workoutTypeService);
			this.workoutTypeService.addWorkoutType(w);
		model.setViewName("adminHome");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}
	
	@RequestMapping(value = "/deleteWorkout", method = RequestMethod.POST)
    public ModelAndView deleteCustomer(@ModelAttribute("WorkoutType") WorkoutType wType, HttpServletRequest request) {
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Front Desk Executive")){
          this.workoutTypeService.deleteWorkout(wType);
          model.setViewName("adminHome");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
          return model;
    }

	
	
	
	@RequestMapping(value="/DeleteWorkoutType", method= RequestMethod.GET)
    public ModelAndView listScheme(HttpServletRequest request) {
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Admin")){
            System.out.println("Controller called for list");
        List<WorkoutType> listWorkoutType =this.workoutTypeService.listWorkoutType();
        System.out.println("Control returned from service list");
        //ModelAndView model = new ModelAndView();
        model.addObject("listWorkout", listWorkoutType);
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}
	@RequestMapping(value="/AddWorkoutType", method= RequestMethod.GET)
	public ModelAndView toAddWorkoutType(HttpServletRequest request)
	{
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Admin")){
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		
	return model; 
	}
}