package com.xpanxion.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.xpanxion.model.Customer;
import com.xpanxion.model.DietPlan;
import com.xpanxion.model.Duration;
import com.xpanxion.model.Employee;
import com.xpanxion.model.Roles;
import com.xpanxion.model.UserLogin;
import com.xpanxion.model.WorkoutPlan;
import com.xpanxion.model.WorkoutType;
import com.xpanxion.service.CustomerService;
import com.xpanxion.service.DietPlanService;
import com.xpanxion.service.DurationService;
import com.xpanxion.service.EmployeeService;
import com.xpanxion.service.UserLoginService;
import com.xpanxion.service.WorkoutPlanService;
import com.xpanxion.service.WorkoutTypeService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private WorkoutTypeService workoutService;

	@Autowired
	private DurationService durationService;

	@Autowired
	private DietPlanService dietPlanSevice;

	@Autowired
	private WorkoutPlanService workoutplanService;

	@Autowired
	UserLoginService userLoginService;
	

	public UserLoginService getUserLoginService() {
		return userLoginService;
	}

	public void setUserLoginService(UserLoginService userLoginService) {
		this.userLoginService = userLoginService;
	}

	public DietPlanService getDietPlanSevice() {
		return dietPlanSevice;
	}

	public void setDietPlanSevice(DietPlanService dietPlanSevice) {
		this.dietPlanSevice = dietPlanSevice;
	}

	public WorkoutPlanService getWorkoutplanService() {
		return workoutplanService;
	}

	public void setWorkoutplanService(WorkoutPlanService workoutplanService) {
		this.workoutplanService = workoutplanService;
	}

	public DurationService getDurationService() {
		return durationService;
	}

	public void setDurationService(DurationService durationService) {
		this.durationService = durationService;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public WorkoutTypeService getWorkoutService() {
		return workoutService;
	}

	public void setWorkoutService(WorkoutTypeService workoutService) {
		this.workoutService = workoutService;
	}

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService ps) {
		this.customerService = ps;
	}

	// For add and update customer

	@RequestMapping(value = "/Customer", method = RequestMethod.POST)
	public ModelAndView addCustomer(@ModelAttribute("customer") Customer c,HttpServletRequest request, BindingResult result) {
		ModelAndView m = new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Front Desk Executive")){
		if (c.getCust_Id()== 0) {
			// new Customer, add it

			this.customerService.addCustomer(c);
			UserLogin userLogin= new UserLogin();
			userLogin.setFname(c.getFirst_Name());
			userLogin.setlName(c.getLast_Name());
			userLogin.setUserName(c.getEmail());
			userLogin.setPassword(c.getContact_No());
			userLogin.setRole("Customer");
			userLogin.setUserId(c.getCust_Id());
			this.userLoginService.addUser(userLogin);
			m.setViewName("fdeHome");

		} else {
			// existing Customer, call update
			this.customerService.updateCustomer(c);
			m.setViewName("fdeHome");
		}
		}
		else{
			m.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return m;

	}

	@RequestMapping(value = "/searchACustomerById", method = RequestMethod.POST)
	public ModelAndView searchACustomerById(@ModelAttribute("customer") Customer p, HttpServletRequest request) {
		System.out.println("Controller called for list");
		ModelAndView model = new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Front Desk Executive")){
		p = this.customerService.getCustomerById(p.getCust_Id());

		// model.setViewName("searchCustomer");

		System.out.println("Controller called for list");
		List<Customer> listUsers = new ArrayList<Customer>();

		listUsers.add(p);
		System.out.println(p.getFirst_Name());
		model.addObject("listPersons", listUsers);
		model.setViewName("viewCustByIdList");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
			return model;

		
	}

	@RequestMapping(value = "/List")
	public ModelAndView listCustomer(HttpServletRequest request) {
		
		ModelAndView model = new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Front Desk Executive")){
			System.out.println("Controller called for list");
		
		List<Customer> listUsers = customerService.listCustomer();
		
		model.addObject("listPersons", listUsers);
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
			return model;
	}
	@RequestMapping(value = "/MembersAssigned")
	public ModelAndView listCustomerAssigned(HttpServletRequest request) {
		System.out.println("Controller called for list");
		ModelAndView model= new ModelAndView();
		String id= request.getSession().getAttribute("id").toString();
		if(request.getSession().getAttribute("role").equals("Trainer")){
		List<Customer> listUsers = customerService.listCustomers(id);
		model.addObject("listPersons", listUsers);
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}


	@RequestMapping(value= "/AssignWorkout", method = RequestMethod.GET)
	public ModelAndView addEmployeeForm(HttpServletRequest request,@ModelAttribute("customer") Customer customer){	
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Trainer")){
			String cust_Id = request.getParameter("id");
			Customer cust = this.customerService.getCustomerById(Integer.parseInt(cust_Id));
			List<WorkoutPlan> listWorkPlan= workoutplanService.listWorkoutPlan();
			//ModelAndView model = new ModelAndView();
			model.addObject("cust", cust);
			
			model.addObject("listwork", listWorkPlan);
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;	
		}
	@RequestMapping(value= "/AssignDiet", method = RequestMethod.GET)
	public ModelAndView assignDiet(HttpServletRequest request,@ModelAttribute("customer") Customer customer){	
		
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Trainer")){
		
			String cust_Id = request.getParameter("id");
			Customer cust = this.customerService.getCustomerById(Integer.parseInt(cust_Id));
			List<DietPlan> listDiets= dietPlanSevice.listDiet();
			//ModelAndView model = new ModelAndView();
			model.addObject("cust", cust);
			
			model.addObject("listwork", listDiets);
			model.setViewName("trainerHome");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;	
		}
	@RequestMapping(value= "/AssignDietPlan", method = RequestMethod.POST)
	public ModelAndView assignDietPlan(@ModelAttribute("customer") Customer customer, HttpServletRequest request)
	{
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Trainer")){
		
		System.out.println(customer);
		this.customerService.trainerdietUpdate(customer.getCust_Id(), customer.getDietPlanID().getDietPlanId());
		model.setViewName("trainerHome");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}
	@RequestMapping(value= "/AssignWorkoutPlan", method = RequestMethod.POST)
	public ModelAndView assignWorkoutPlan(@ModelAttribute("customer") Customer customer, HttpServletRequest request)
	{
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Trainer")){
		this.customerService.update(customer);
		model.setViewName("MembersAsigned");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}
			
		
	@RequestMapping(value= "/Edit", method = RequestMethod.GET)
	public ModelAndView generateEmployeData(HttpServletRequest request,@ModelAttribute("customer") Customer customer){	
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Front Desk Executive")){
		String cust_Id = request.getParameter("id");
		Customer cust = this.customerService.getCustomerById(Integer.parseInt(cust_Id));
		//ModelAndView model = new ModelAndView();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		List<Employee> listTrainer1 = employeeService.listEmployeeTrainer();
		List<WorkoutType> listWorkoutType1 = workoutService.listWorkoutType();
		List<Duration> listDuartion1 = durationService.listDuration();
		List<WorkoutPlan> listWorkPlan= workoutplanService.listWorkoutPlan();
		List<DietPlan> listDietPlans=dietPlanSevice.listDiet();
			
		model.addObject("cust", cust);
		model.addObject("listTrainer", listTrainer1);
		model.addObject("listWorkouttype", listWorkoutType1);
		model.addObject("listDuration", listDuartion1);
		model.addObject("listwork", listWorkPlan);
		model.addObject("listDiet", listDietPlans);
		System.out.println(cust.getFirst_Name());
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	 }
	@RequestMapping(value= "/updateCustomer", method = RequestMethod.POST)
	public ModelAndView editEmployee(HttpServletRequest request,@ModelAttribute("customer") Customer customer){
//		String empId = request.getParameter("id");
//		System.out.println("*****************************"+empId+"**********************************");
//		System.out.println("Role"+employee.getRoles());
//		/*System.out.println(e.getRoles().getRoleId());*/
//		 
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Front Desk Executive")){
			System.out.println("In Controller "+customer);
		
//		
		
			this.customerService.updateCustomer(customer);;
			model.setViewName("List");
			model.setViewName("fdeHome");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}
	
/*
	@RequestMapping(value = "/TrainerDietUpdate", method = RequestMethod.POST)
	public ModelAndView updateDietTrainer(@ModelAttribute("customer") Customer cust, HttpServletRequest request) {

		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Trainer"){
		System.out.println("CustId " + cust.getCust_Id() + "\t");
		System.out.println("Diet Plan Id " + cust.getDietPlanID().getDietPlanId() + "\t");
		// if(scheme.getSchemeId().equals(0)//new person, add it
		this.customerService.trainerdietUpdate(cust.getCust_Id(), cust.getDietPlanID().getDietPlanId());
		model.setViewName("");
		}
		return "redirect:/";
	}
	*/
/*	@RequestMapping(value = "TrainerUpdateWorkout", method = RequestMethod.POST)
	public String updateWorkoutTrainer(@ModelAttribute("customer") Customer cust) {

		System.out.println("CustId " + cust.getCust_Id() + "\t");
		System.out.println("Workout Plan Id " + cust.getCustWorkoutPlan().getWorkoutplanId() + "\t");
		// if(scheme.getSchemeId().equals(0)//new person, add it
		this.customerService.trainerworkoutUpdate(cust.getCust_Id(), cust.getCustWorkoutPlan().getWorkoutplanId());
		return "redirect:/";
	}*/

	@RequestMapping(value = "/redirectToSeacrchCustomer", method = RequestMethod.GET)
	public ModelAndView redirectToSeacrchCustomer() {
		ModelAndView model = new ModelAndView();
		model.setViewName("searchcustbyId");
		return model;

	}

	@RequestMapping(value = "/Customer", method = RequestMethod.GET)
	public ModelAndView redirectTomappingtrainertocustomer(@ModelAttribute("command") Customer c1, HttpServletRequest request) {
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Front Desk Executive")){
		//ModelAndView model = new ModelAndView();
		c1 = new Customer();
		List<Employee> listTrainer = employeeService.listEmployeeTrainer();
		List<WorkoutType> listWorkoutType = workoutService.listWorkoutType();
		List<Duration> listDuartion = durationService.listDuration();
		List<DietPlan> listdietPlan = dietPlanSevice.listDiet();
		List<WorkoutPlan> workoutCust = workoutplanService.listWorkoutPlan();
		model.addObject("custWorkoutPlan", workoutCust);
		model.addObject("listTrainer", listTrainer);
		model.addObject("listduartion", listDuartion);
		model.addObject("listWorkoutType", listWorkoutType);
		model.addObject("listdiet", listdietPlan);
		model.addObject("listworkout", workoutCust);
		model.addObject("customer", c1);
System.out.println("AAya control?");
		model.setViewName("Customer");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}


	@RequestMapping(value = "/TrainerWorkoutUpdate", method = RequestMethod.GET)
	public ModelAndView redirectToupdateTrainerDietWorkoutPlan(@ModelAttribute("command") Customer c, HttpServletRequest request) 
		{
		ModelAndView model= new ModelAndView();
		/*if(request.getSession().getAttribute("role").equals("Trainer"){
//		ModelAndView model = new ModelAndView();
		c = new Customer();
		List<WorkoutPlan> workoutCustTrainerupdate = workoutplanService.listWorkoutPlan();

		System.out.println("List controller");
		model.addObject("listworkoutplan", workoutCustTrainerupdate);

		System.out.println(workoutCustTrainerupdate.size());

		model.setViewName("TrainerWorkOutUpdate");

		model.addObject("customer", c);
		}
		else
			model.setViewName("Error");
*/		
		return model;
	}
	

	@RequestMapping(value = "/TrainerDietUpdate", method = RequestMethod.GET)
	public ModelAndView redirectToupdateTrainerDietPlan(@ModelAttribute("command") Customer c, HttpServletRequest request) {

		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Trainer")){
		//ModelAndView model = new ModelAndView();
		c = new Customer();
		List<DietPlan> DietPlanupdate = dietPlanSevice.listDiet();

		System.out.println("List controller"); 
	System.out.println(DietPlanupdate.size());
		model.addObject("listdietupdate", DietPlanupdate);

		model.setViewName("TrainerDietUPDATE");

		model.addObject("customer", c);
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}

		return model;
	}
//	@RequestMapping(value = "/searchcustbyId", method = RequestMethod.GET)
//	public void loadSearch()
//	{}
}
