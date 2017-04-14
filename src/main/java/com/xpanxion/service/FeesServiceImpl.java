package com.xpanxion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xpanxion.DAO.FeesDao;
import com.xpanxion.model.Fees;

@Service
public class FeesServiceImpl implements FeesService{
	public FeesDao getFeesDao() {
		return feesDao;
	}

	public void setFeesDao(FeesDao feesDao) {
		this.feesDao = feesDao;
	}

	private FeesDao feesDao;
	
	@Transactional
	public void addFees(Fees fees) {
		System.out.println(feesDao);
		this.feesDao.addFees(fees);
		
	}
	@Transactional
	public List<Fees> listFees(int custId) {
		
		return this.feesDao.listFees(custId);
	}
	
	@Transactional
	public List<Fees> listMonthlyFees(String month) {
		return this.feesDao.listMonthlyFees(month);
	}
}
