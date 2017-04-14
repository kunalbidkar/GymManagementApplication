package com.xpanxion.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xpanxion.DAO.EmployeeDao;
import com.xpanxion.model.Employee;;
@Service
public class EmployeeServiceImpl implements EmployeeService {
   
	@Autowired
	private EmployeeDao EmployeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.EmployeeDao = employeeDao;
	}
	@Transactional
	public void addEmployee(Employee e) {
		System.out.println("In service");
		this.EmployeeDao.addEmployee(e);
		
	}
	 @Transactional
	public List<Employee> listActiveEmployee() {
       return  this.EmployeeDao.listActiveEmployee();
        
	}
	 @Transactional
	 public List<Employee> listInActiveEmployee() {
		 System.out.println("In inactive service");
	       return  this.EmployeeDao.listInActiveEmployee();
	        
		}
	 
	 @Transactional
	 public List<Employee> listEmployee() {
		 System.out.println("In service");
	       return  this.EmployeeDao.listEmployee();
	        
		}
	 @Transactional
	public List<Employee> listEmployeeTrainer() {
		// TODO Auto-generated method stub
		 System.out.println("In service");
		 return this.EmployeeDao.listEmployeeTrainer();
	}
	@Transactional
	 public Employee getEmployeeById(int empId) {
			return EmployeeDao.getEmployeeById(empId);
		}

	 
}
