package com.xpanxion.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xpanxion.model.*;
import com.xpanxion.service.DurationService;
import com.xpanxion.service.SchemeService;
import com.xpanxion.service.WorkoutTypeService;



@Controller
public class SchemeController {
	@Autowired
	private SchemeService schemeService;
	
@Autowired
	private WorkoutTypeService workoutTypeService;
	
	@Autowired
	private DurationService durationService;
	public void setDurationService(DurationService durationService) {
		this.durationService = durationService;
	}

	public void setWorkoutTypeService(WorkoutTypeService workoutTypeService) {
		this.workoutTypeService = workoutTypeService;
	}

	public void setSchemeService(SchemeService schemeService) {
		this.schemeService = schemeService;
	}
	
	/*@RequestMapping("/schemeupdate/{workoutType}")
    public String editPerson(@PathVariable("workoutType") int workoutType, Model model){
        model.addAttribute("scheme", this.schemeService.getSchemeByWorkoutType(workoutType));
        model.addAttribute("listSchemes", this.schemeService.listScheme());
        return "person";
	
	}*/
	
	@RequestMapping(value="/schemeupdate", method = RequestMethod.POST)
	public ModelAndView updateScheme(@ModelAttribute("scheme") Scheme scheme, HttpServletRequest request){
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Admin")){
		//System.out.println("WorkoutType " +scheme.getWorkoutType().getWorkoutId()+"\t" );
		System.out.println("Price " +scheme.getPrice()+"\t"+scheme.getSchemeId() );

		this.schemeService.updateScheme(scheme,scheme.getPrice());
		model.setViewName("adminHome");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}
	
	
	
	@RequestMapping(value="/schemeadd", method = RequestMethod.POST)
	public String addScheme(@ModelAttribute("scheme") Scheme scheme){
		
		System.out.println("Controller " +schemeService);
		//System.out.println("Controller " +scheme.getPrice()+"\t" );
			
		
			this.schemeService.addScheme(scheme);
		return "redirect:/adminHome";
	}
	
	/*@RequestMapping(value = "/schemeupdate", method = RequestMethod.GET)
    public String listScheme(Model model) {
                    model.addAttribute("Scheme", new Scheme());
                    model.addAttribute("listScheme", this.schemeService.listScheme());
                    return "Scheme";
    }*/
	
	
	@RequestMapping(value="/SchemeList", method= RequestMethod.GET)
    public ModelAndView listScheme() {
            System.out.println("Controller called for list");
        List<Scheme> listschemeName =this.schemeService.listScheme();
        System.out.println("Control returned from service list");
        ModelAndView model = new ModelAndView();
        model.addObject("listSchemes", listschemeName);
        return model;
	}
	@RequestMapping(value="/Offers", method= RequestMethod.GET)
    public ModelAndView Offers() {
            System.out.println("Controller called for list");
        List<Scheme> listschemeName =this.schemeService.listScheme();
        System.out.println("Control returned from service list");
        ModelAndView model = new ModelAndView();
        model.addObject("listSchemes", listschemeName);
        return model;
	}
	
	@RequestMapping(value="/Scheme", method= RequestMethod.GET)
    public ModelAndView listWorkoutType(HttpServletRequest request) {
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Admin")){
			System.out.println("Controller called for list");
		
        List<WorkoutType> listWorkoutType =this.workoutTypeService.listWorkoutType();
        List<Duration> listDuration =this.durationService.listDuration();
        System.out.println(listDuration.size()+"Control returned from service list");
        Scheme scheme=new Scheme();
       // ModelAndView model = new ModelAndView();
        model.addObject("listWorkout", listWorkoutType);
        model.addObject("listDuration", listDuration);
        model.addObject("scheme", scheme);
        model.setViewName("Scheme");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
			return model;
	}

	public SchemeService getSchemeService() {
		return schemeService;
	}

	public WorkoutTypeService getWorkoutTypeService() {
		return workoutTypeService;
	}

	public DurationService getDurationService() {
		return durationService;
	}
	
	/*@RequestMapping(value="/Scheme", method= RequestMethod.GET)
    public ModelAndView listDuration() {
            System.out.println("Controller called for list");
        List<Duration> listDuration =this.durationService.listDuration();
        System.out.println("Control returned from service list");
        Scheme scheme=new Scheme();
        ModelAndView model = new ModelAndView();
        model.addObject("listDuration", listDuration);
        model.addObject("scheme", scheme);
        model.setViewName("Scheme");
        return model;
	}*/
	
	
}