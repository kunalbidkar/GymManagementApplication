package com.xpanxion.service;
import java.util.List;

import com.xpanxion.model.CustHStats;
import com.xpanxion.model.Customer;


public interface CustHStatsService {
	
//	public List<CustHStats> statsList();
	public void addStats(CustHStats chs);

	public List<Customer> listCustomerHealthStats();



	public List<CustHStats>searchHealthStatsById(int c);
	
}
