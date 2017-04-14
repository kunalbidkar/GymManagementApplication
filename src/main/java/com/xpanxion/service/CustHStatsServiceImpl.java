package com.xpanxion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xpanxion.DAO.CustHStatsDAO;
import com.xpanxion.model.CustHStats;
import com.xpanxion.model.Customer;


@Service
public class CustHStatsServiceImpl implements CustHStatsService {
	
	@Autowired
private CustHStatsDAO statsDao;
	public CustHStatsDAO getStatsDao() {
		return statsDao;
	}

	public void setStatsDao(CustHStatsDAO statsDao) {
		this.statsDao = statsDao;
	}
	@Transactional
	public void addStats(CustHStats chs) {
		// TODO Auto-generated method stub
		System.out.println(chs.getHt());
	 double meters = chs.getHt()/100;
	 System.out.println(meters);
	 
		double bmi_cal=((chs.getWt())/(meters*meters));
		chs.setBmi(bmi_cal);
		System.out.println(bmi_cal);
		this.statsDao.addStats(chs);
	}
//	@Transactional
//	public List<CustHStats> statsList() {
//		// TODO Auto-generated method stub
//		return this.statsDao.statsList();
//	}
	@Transactional
	public List<Customer> listCustomerHealthStats() {
		// TODO Auto-generated method stub@Transactional
		
			// TODO Auto-generated method stub
			return this.statsDao.listCustomerHealthStats();
		
		
	}
	
	
	@Transactional
	public List<CustHStats> searchHealthStatsById(int c) {
		// TODO Auto-generated method stub
		return this.statsDao.searchHealthStatsById(c);
		
	}
    
}
