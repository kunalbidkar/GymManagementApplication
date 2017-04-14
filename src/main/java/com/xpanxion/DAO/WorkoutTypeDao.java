package com.xpanxion.DAO;

import java.util.List;

import com.xpanxion.model.WorkoutType;



public interface WorkoutTypeDao {
	public void addWorkoutType(WorkoutType wType);
	/*public void updateWorkoutType(String workoutName);*/
	public List<WorkoutType> listWorkoutType(); 
	public void deleteWorkout(WorkoutType workout);
}
