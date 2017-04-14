package com.xpanxion.service;

import java.util.List;

import com.xpanxion.model.WorkoutType;



public interface WorkoutTypeService {
	public void addWorkoutType(WorkoutType wType);
	/*public void updateWorkoutType(String workoutName);*/
	public List<WorkoutType> listWorkoutType();
	public void deleteWorkout(WorkoutType workout);
}
