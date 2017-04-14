package com.xpanxion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.xpanxion.DAO.WorkoutTypeDao;
import com.xpanxion.model.WorkoutType;

public class WorkoutTypeServiceImpl implements WorkoutTypeService{
	
	
	private WorkoutTypeDao workoutTypeDao; 
	
	public void setWorkoutTypeDao(WorkoutTypeDao workoutTypeDao) {
		this.workoutTypeDao = workoutTypeDao;
	}
	@Transactional
	public void addWorkoutType(WorkoutType wType) {
		System.out.println("In service");
		this.workoutTypeDao.addWorkoutType(wType);	
	}
	@Transactional
	public List<WorkoutType> listWorkoutType() {
		System.out.println("Service called");
		 return  this.workoutTypeDao.listWorkoutType();
	    
	}
	@Transactional
	public void deleteWorkout(WorkoutType workout) {
		this.workoutTypeDao.deleteWorkout(workout);
	}

}
