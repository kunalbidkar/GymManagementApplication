package com.xpanxion.service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xpanxion.DAO.DietPlanDao;
import com.xpanxion.model.DietPlan;

@Service
public class DietPlanSeviceImpl implements DietPlanService {
	

	DietPlanDao dietPlanDao;
	

	

	@Transactional
	public void addDiet(DietPlan d) {
		System.out.println("Diet Service called");
		this.dietPlanDao.addDiet(d);
		

	}

    @Transactional
	public void updateDiet(DietPlan d) {
		// TODO Auto-generated method stub
    	System.out.println("Diet Service called");
		this.dietPlanDao.upadateDiet(d);
		
	}

    @Transactional
	public List<DietPlan> listDiet() {
		// TODO Auto-generated method stub
    	return this.dietPlanDao.listDiet();
		
		
	}

	public DietPlanDao getDietPlanDao() {
		return dietPlanDao;
	}

	public void setDietPlanDao(DietPlanDao dietPlanDao) {
		this.dietPlanDao = dietPlanDao;
	}


	

}
