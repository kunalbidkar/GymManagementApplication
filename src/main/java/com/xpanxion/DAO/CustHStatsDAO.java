package com.xpanxion.DAO;

import java.util.List;

import com.xpanxion.model.CustHStats;
import com.xpanxion.model.Customer;

public interface CustHStatsDAO {
	
	public void addStats(CustHStats chs);

//	public List<CustHStats> statsList();

	public List<Customer> listCustomerHealthStats();



	public List<CustHStats> searchHealthStatsById(int c);

}
