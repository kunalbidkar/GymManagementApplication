package com.xpanxion.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table
public class WorkoutType {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int workoutId;
	public int getWorkoutId() {
		return workoutId;
	}
	public void setWorkoutId(int workoutId) {
		this.workoutId = workoutId;
	}
	public String getWorkoutName() {
		return workoutName;
	}
	public void setWorkoutName(String workoutName) {
		this.workoutName = workoutName;
	}
	@Column
	private String workoutName;
	@OneToMany(mappedBy="workoutType")
	private Set<Scheme> scheme;
	
	@OneToMany(mappedBy="workoutType")
	private Set<WorkoutPlan> workoutPlan;
	public Set<WorkoutPlan> getWorkoutPlan() {
		return workoutPlan;
	}
	public void setWorkoutPlan(Set<WorkoutPlan> workoutPlan) {
		this.workoutPlan = workoutPlan;
	}

}
