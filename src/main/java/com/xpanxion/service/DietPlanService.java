package com.xpanxion.service;


import java.util.List;

import com.xpanxion.model.DietPlan;

public interface DietPlanService {
	public void addDiet(DietPlan d);

	public void updateDiet(DietPlan d);

	

	public List<DietPlan> listDiet();

	

}
