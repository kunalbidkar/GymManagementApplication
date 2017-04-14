package com.xpanxion.service;

import java.util.List;

import com.xpanxion.model.Customer;
import com.xpanxion.model.DietPlan;

public interface CustomerService {

	public void addCustomer(Customer c);

	public void updateCustomer(Customer c);

	public List<Customer> listCustomer();

	public Customer getCustomerById(int cust_Id);

	

	public void trainerdietUpdate(int cust_Id, int dietPlanId);

	public void trainerworkoutUpdate(int cust_Id, int workoutplanId);

	public void update(Customer customer);

	public List<Customer> listCustomers(String id);


}
