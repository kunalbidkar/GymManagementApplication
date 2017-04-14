package com.xpanxion.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xpanxion.DAO.CustomerDAO;
import com.xpanxion.model.Customer;
import com.xpanxion.model.DietPlan;

@Service
public class CustomerServiceImpl implements CustomerService {

	//@Autowired
	private CustomerDAO customerDAO;

	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Transactional
	public void addCustomer(Customer c) {
		System.out.println("Service called");
		this.customerDAO.addCustomer(c);
	}

	@Transactional
	public void updateCustomer(Customer c) {
		System.out.println("Service called");
		this.customerDAO.updateCustomer(c);

	}

	@Transactional
	public List<Customer> listCustomer() {
		System.out.println("Service list called");
		return this.customerDAO.listCustomer();
	}

	@Transactional
	public Customer getCustomerById(int cust_Id) {
		// TODO Auto-generated method stub
		System.out.println("Service called for get element by id");
		return this.customerDAO.getCustomerById(cust_Id);

	}

	
   @Transactional
	public void trainerdietUpdate(int cust_Id, int dietPlanId) {
		// TODO Auto-generated method stub
	   System.out.println("Service called");
	   this.customerDAO.trainerdietUpdate(cust_Id,dietPlanId);
		
	}
   @Transactional
public void trainerworkoutUpdate(int cust_Id, int workoutplanId) {
	// TODO Auto-generated method stub
	 System.out.println("Service called");
	   this.customerDAO.trainerworkoutUpdate(cust_Id, workoutplanId);
	
}

public void update(Customer customer) {
	this.customerDAO.trainerworkoutUpdate(customer.getCust_Id(),customer.getCustWorkoutPlan().getWorkoutplanId());
}

public List<Customer> listCustomers(String id) {
	// TODO Auto-generated method stub
	return this.customerDAO.listCustomers(id);
}

}
