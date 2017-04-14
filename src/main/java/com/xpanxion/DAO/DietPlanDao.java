package com.xpanxion.DAO;

import java.util.List;

import com.xpanxion.model.DietPlan;

public interface DietPlanDao {
	public void addDiet(DietPlan d);

	public void upadateDiet(DietPlan d);

	public List<DietPlan> listDiet();

}
