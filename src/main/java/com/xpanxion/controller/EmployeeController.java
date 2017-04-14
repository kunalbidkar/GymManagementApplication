package com.xpanxion.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xpanxion.model.Employee;
import com.xpanxion.model.Roles;
import com.xpanxion.model.UserLogin;
import com.xpanxion.service.EmployeeService;
import com.xpanxion.service.RolesService;
import com.xpanxion.service.UserLoginService;



@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private RolesService rolesService;
	
	@Autowired
	UserLoginService userLoginService;
	
	public void setRolesService(RolesService rolesService) {
		this.rolesService = rolesService;
	}



	
	 public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
		@RequestMapping(value= "/UpdateEmployee", method = RequestMethod.GET)
		public ModelAndView addEmployeeForm(HttpServletRequest request,@ModelAttribute("command") Employee employee,  BindingResult result){	
			ModelAndView model= new ModelAndView();
			if(request.getSession().getAttribute("role").equals("Admin")){
				
			
			String empId = request.getParameter("id");
			Employee employee1 = this.employeeService.getEmployeeById(Integer.parseInt(empId));
			//ModelAndView model = new ModelAndView();
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			List<Roles> listroleName =this.rolesService.listRoles();		
			model.addObject("employee", employee1);
			model.addObject("listRoles", listroleName);
			}
			else{
				model.setViewName("Error");
				request.getSession().setAttribute("role","");
		}
			return model;
			
		 }
		@RequestMapping(value= "/editEmployee", method = RequestMethod.POST)
		public ModelAndView editEmployee(HttpServletRequest request,@ModelAttribute("employee") Employee employee){
			ModelAndView model= new ModelAndView();
			if(request.getSession().getAttribute("role").equals("Admin")){
			String empId = request.getParameter("id");
			System.out.println("*****************************"+empId+"**********************************");
			System.out.println("Role"+employee.getRoles());
			/*System.out.println(e.getRoles().getRoleId());*/
			 
			System.out.println("In Controller "+employee);
			
			if(employee.getEmpId()!=0)
				this.employeeService.addEmployee(employee);
			model.setViewName("adminHome");
			}
			else{
				model.setViewName("Error");
				request.getSession().setAttribute("role","");
		}
			return model;
		}
		
		
	  

	
	/*@RequestMapping(value = "/Employee", method = RequestMethod.GET)
    public String listEmployee(Model model) {
                    model.addAttribute("Employee", new Employee());
                    model.addAttribute("listEmployee", this.employeeService.listEmployee());
                    return "Employee";
    }*/

	
	
	
	@RequestMapping(value= "/Employee", method = RequestMethod.POST)
	public ModelAndView addEmployee(@ModelAttribute("Employee") Employee e, HttpServletRequest request){

		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Admin")){
			this.employeeService.addEmployee(e);
		
		UserLogin userLogin=new UserLogin();
		userLogin.setFname(e.getFname());
		userLogin.setlName(e.getLname());
		userLogin.setPassword(e.getContact());
		userLogin.setUserName(e.getEmail());
		userLogin.setUserId(e.getEmpId());
		Roles role=this.rolesService.getRolesById(e.getRoles().getRoleId());
		userLogin.setRole(role.getRoleName());
		this.userLoginService.addUser(userLogin);
		model.setViewName("adminHome");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}
	
	@RequestMapping(value= "/ActiveEmployees", method = RequestMethod.POST)
	public ModelAndView listActiveEmployee(HttpServletRequest request) {
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Admin")){
            System.out.println("Controller called for list");
        List<Employee> listActiveEmployee =this.employeeService.listActiveEmployee();
        System.out.println("Control returned from service list");
        //ModelAndView model = new ModelAndView();
        model.addObject("listActiveEmployee", listActiveEmployee);
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}
	@RequestMapping(value= "/InActiveEmployees", method = RequestMethod.POST)
	public ModelAndView listInActiveEmployee(HttpServletRequest request) {
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Admin")){
            System.out.println("Controller called for list inactive");
        List<Employee> listInActiveEmployee =this.employeeService.listInActiveEmployee();
        System.out.println("Control returned from service list");
//        ModelAndView model = new ModelAndView();
        model.addObject("listInActiveEmployee", listInActiveEmployee);
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}
	
	@RequestMapping(value= "/ListEmployees", method = RequestMethod.POST)
	public ModelAndView listEmployee(HttpServletRequest request) {
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Admin")){
            System.out.println("Controller called for list");
        List<Employee> listEmployee =this.employeeService.listEmployee();
        System.out.println("Control returned from service list");
//        ModelAndView model = new ModelAndView();
        model.addObject("listEmployee", listEmployee);
  
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}
	
	@RequestMapping(value="/AddEmployee", method= RequestMethod.GET)
    public ModelAndView listScheme(HttpServletRequest request) {
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Admin")){
			System.out.println("Controller called for list");
		
        List<Roles> listroleName =this.rolesService.listRoles();
        System.out.println("Control returned from service list");
        Employee emp=new Employee();
//        ModelAndView model = new ModelAndView();
        model.addObject("listRoles", listroleName);
        model.addObject("employee", emp);
	}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}
	
  }

	

		
	
