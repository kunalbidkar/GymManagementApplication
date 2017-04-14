package com.xpanxion.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xpanxion.DAO.DurationDao;
import com.xpanxion.model.*;


@Service
public class DurationServiceImpl implements DurationService {
	@Autowired
	private DurationDao durationDao;
	
	public void setDurationDao(DurationDao durationDao) {
		this.durationDao = durationDao;
	}
	
	@Transactional
	public void addDuration(com.xpanxion.model.Duration duration) {
		// TODO Auto-generated method stub
		System.out.println("In service");
		this.durationDao.addDuration(duration);
	}
	@Transactional
	public List<Duration> listDuration() {
		System.out.println("Service called");
		 return  this.durationDao.listDuration();
	}
	@Transactional
	public void deleteDuration(com.xpanxion.model.Duration duration) {
		// TODO Auto-generated method stub
		System.out.println("Service!@!##@!#!@#!");
		this.durationDao.deleteDuration(duration);;
		
	}
	
	
}