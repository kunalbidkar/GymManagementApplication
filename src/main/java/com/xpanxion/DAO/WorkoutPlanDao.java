package com.xpanxion.DAO;

import java.util.List;

import com.xpanxion.model.WorkoutPlan;

public interface WorkoutPlanDao {
	public void addWorkoutPlan(WorkoutPlan wPlan);
	public List<WorkoutPlan> listWorkoutPlan(); 
	public void deleteWorkoutPlan(WorkoutPlan wPlan);
}
