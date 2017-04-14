package com.xpanxion.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xpanxion.model.Roles;
import com.xpanxion.service.RolesService;


@Controller
public class RolesController {

	@Autowired
	private RolesService rolesService;




	public void setRolesService(RolesService rolesService) {
		this.rolesService = rolesService;
	}



	@RequestMapping(value="/Role")
	public ModelAndView loadRole(@ModelAttribute("roles") Roles roles, HttpServletRequest request){
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Admin")){
			
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}
		
	//For add and update person both
	@RequestMapping(value="/roleadd", method = RequestMethod.POST)
	public ModelAndView addRole(@ModelAttribute("roles") Roles roles, HttpServletRequest request){
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Admin")){
		System.out.println("Controller " +roles.getRoleName()+"\t" );
			
		if(roles.getRoleId()==0)//new person, add it
			this.rolesService.addRole(roles);;
		model.setViewName("adminHome");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
		
	}
	/*@RequestMapping(value= "/redirectToAddEmployeePage", method = RequestMethod.POST)
	public ModelAndView  redirectToAddEmployeePage(@ModelAttribute(value = "services") Employee emp){
		ModelAndView model = new ModelAndView();
		model.addObject("command", new Employee());
		model.setViewName("AddEmployee");
		return model;
		
	}*/
	
	}
