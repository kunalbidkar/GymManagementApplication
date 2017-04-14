package com.xpanxion.DAO;

import java.util.List;

import com.xpanxion.model.Customer;
import com.xpanxion.model.DietPlan;

public interface CustomerDAO {
	public void addCustomer(Customer c);
	public void updateCustomer(Customer c);

	

	

	public List<Customer> listCustomer();
	public Customer getCustomerById(int id);
	
	public void trainerdietUpdate(int cust_Id, int dietPlanId);
	public void trainerworkoutUpdate(int cust_Id, int workoutplanId);
	//public void update(Customer customer);
//	public void update(Customer customer);
	public List<Customer> listCustomers(String id);

}
