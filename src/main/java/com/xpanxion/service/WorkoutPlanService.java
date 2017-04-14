package com.xpanxion.service;
import java.util.List;

import com.xpanxion.model.WorkoutPlan;


public interface WorkoutPlanService {
	public void addWorkoutPlan(WorkoutPlan wPlan);
	public List<WorkoutPlan> listWorkoutPlan(); 
	public void deleteWorkoutPlan(WorkoutPlan wPlan);
}
