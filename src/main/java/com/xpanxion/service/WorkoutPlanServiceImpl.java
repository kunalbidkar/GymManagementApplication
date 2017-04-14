package com.xpanxion.service;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xpanxion.DAO.WorkoutPlanDao;
import com.xpanxion.model.WorkoutPlan;

@Service
public class WorkoutPlanServiceImpl implements WorkoutPlanService{
	@Autowired
	private WorkoutPlanDao workoutPlanDao;
	public void setWorkoutPlanDao(WorkoutPlanDao workoutPlanDao) {
		this.workoutPlanDao = workoutPlanDao;
	}

	public void addWorkoutPlan(WorkoutPlan wPlan) {
		System.out.println("In service");
		this.workoutPlanDao.addWorkoutPlan(wPlan);
		
	}
	public List<WorkoutPlan> listWorkoutPlan() {
		// TODO Auto-generated method stub
		return this.workoutPlanDao.listWorkoutPlan();
	}


	public void deleteWorkoutPlan(WorkoutPlan wPlan) {
		this.workoutPlanDao.deleteWorkoutPlan(wPlan);
		
	}

}
