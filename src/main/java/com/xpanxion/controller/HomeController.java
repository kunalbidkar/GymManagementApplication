package com.xpanxion.controller;

import javax.servlet.http.HttpServletRequest;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xpanxion.model.UserLogin;
import com.xpanxion.service.UserLoginService;

@Controller
public class HomeController {

	@Autowired
	UserLoginService userLoginService;
	public UserLoginService getUserLoginService() {
		return userLoginService;
	}

	public void setUserLoginService(UserLoginService userLoginService) {
		this.userLoginService = userLoginService;
	}

	@RequestMapping(value="/Event", method= RequestMethod.GET)
    public void loadEvents() {}
	
	@RequestMapping(value="/aboutUs", method= RequestMethod.GET)
    public void aboutUs() {}
	@RequestMapping(value="/ContactUs", method= RequestMethod.GET)
    public void ContactUs() {}
	@RequestMapping(value="/adminHome", method= RequestMethod.GET)
    public ModelAndView loadAdmin(HttpServletRequest request) {
		
		System.out.println("yaha pahoncha");
		ModelAndView m= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Admin"))
		m.setViewName("adminHome");
		else{
			m.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		System.out.println("Access denied");
		return m;
	}

	@RequestMapping(value="/trainerHome", method= RequestMethod.GET)
    public ModelAndView loadTrainer(HttpServletRequest request) {
		ModelAndView m= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Trainer"))
		m.setViewName("trainerHome");
		else{
			m.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		System.out.println("Access denied");
		return m;
	}

	@RequestMapping(value="/fdeHome", method= RequestMethod.GET)
    public ModelAndView loadFde(HttpServletRequest request) {
		ModelAndView m= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Front Desk Executive"))
		m.setViewName("fdeHome");
		else{
			m.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		System.out.println("Access denied");
		return m;
	}

	@RequestMapping(value="/dieticianHome", method= RequestMethod.GET)
    public ModelAndView loadDietician(HttpServletRequest request) {
		ModelAndView m= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Dietician"))
		m.setViewName("dieticianHome");
		else{
			m.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		System.out.println("Access denied");
		return m;
	}

	@RequestMapping(value="/customerHome", method= RequestMethod.GET)
    public ModelAndView loadCustomer(HttpServletRequest request) {
		ModelAndView m= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Customer"))
		m.setViewName("customerHome");
		else{
			m.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		System.out.println("Access denied");
		return m;
	}
	
	@RequestMapping(value="/Duration", method= RequestMethod.GET)
    public ModelAndView loadDuration(HttpServletRequest request) {
		ModelAndView m= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Admin")){
		m.setViewName("Duration");}
		
		else{
			m.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		System.out.println("Access denied");
		return m;
	}
	
	@RequestMapping(value="/Login", method= RequestMethod.GET)
    public void login() {
	
	}
	@RequestMapping(value="/logout", method= RequestMethod.GET)
    public String logout(HttpServletRequest request) {
		//ModelAndView model= new ModelAndView();
		//model.addObject("status", "false");
		request.getSession().setAttribute("role","");
		return "redirect:/Login";
	}
	@RequestMapping(value="/login", method= RequestMethod.POST)
    public ModelAndView authenticate(HttpServletRequest request, UserLogin user) {
		
		ModelAndView m= new ModelAndView();System.out.println(user.getUserName()+"\t"+user.getPassword());
		try{UserLogin userLogin=this.userLoginService.authenticate(user);
		
		
		String res="";
		m.addObject("fname",userLogin.getFname());
		m.addObject("user", userLogin);
		m.addObject("status", "true");
		request.getSession().setAttribute("id", user.getUserId());
		if(userLogin.getRole().equals("Admin")){
			request.getSession().setAttribute("fname",userLogin.getFname());
			request.getSession().setAttribute("lname",userLogin.getlName());
			request.getSession().setAttribute("role",userLogin.getRole());
			request.getSession().setAttribute("status","true");
			
			System.out.println(userLogin.getRole());
			m.setViewName("adminHome");
		}
		if(userLogin.getRole().equals("Trainer"))
			{
			request.getSession().setAttribute("fname",userLogin.getFname());
			request.getSession().setAttribute("lname",userLogin.getlName());
			request.getSession().setAttribute("role",userLogin.getRole());
			request.getSession().setAttribute("status","true");
			System.out.println(userLogin.getRole());m.setViewName("trainerHome");
			}
		if(userLogin.getRole().equals("Front Desk Executive"))
			{
			request.getSession().setAttribute("fname",userLogin.getFname());
			request.getSession().setAttribute("lname",userLogin.getlName());
			request.getSession().setAttribute("role",userLogin.getRole());
			request.getSession().setAttribute("status","true");
			System.out.println(userLogin.getRole());
			m.setViewName("fdeHome");
			}
		if(userLogin.getRole().equals("Dietician"))
			{
			request.getSession().setAttribute("fname",userLogin.getFname());
			request.getSession().setAttribute("lname",userLogin.getlName());
			request.getSession().setAttribute("role",userLogin.getRole());
			request.getSession().setAttribute("status","true");
			System.out.println(userLogin.getRole());
			m.setViewName("dieticianHome");
			}
		if(userLogin.getRole().equals("Customer")){
		
			request.getSession().setAttribute("fname",userLogin.getFname());
			request.getSession().setAttribute("lname",userLogin.getlName());
			request.getSession().setAttribute("role",userLogin.getRole());
			request.getSession().setAttribute("status","true");
			m.setViewName("customerHome");
		}}
		 catch(Exception e)
	    {
	    	JOptionPane optionPane = new JOptionPane();
			  JOptionPane optionPane1 = new JOptionPane();
			  //String name = roles.getRoleName();
			  
			   optionPane1 = new JOptionPane();
			   optionPane1.setMessage("Enter Valid credentials");
			   JDialog dialog1 = optionPane1.createDialog("Failure");

			   dialog1.setAlwaysOnTop(true);
			   dialog1.setVisible(true);
			   
			  m.setViewName("Login");
	    }
		
		
	
		return m;
	}
}

