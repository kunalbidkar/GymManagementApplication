package com.xpanxion.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class WorkoutPlan {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int workoutplanId;
	@Column
	private String trainingLevel;
	@Column
	private String trainingIntensity;
	@Column
	private String Schedule;
	@Column
	private String trainingPlan;
	
	
	@ManyToOne
	@JoinColumn(name="workoutId", nullable=false)
	private WorkoutType workoutType;
	
	public WorkoutType getWorkoutType() {
		return workoutType;
	}
	public void setWorkoutType(WorkoutType workoutType) {
		this.workoutType = workoutType;
	}
	public int getWorkoutplanId() {
		return workoutplanId;
	}
	public void setWorkoutplanId(int workoutplanId) {
		this.workoutplanId = workoutplanId;
	}
	public String getTrainingLevel() {
		return trainingLevel;
	}
	public void setTrainingLevel(String trainingLevel) {
		this.trainingLevel = trainingLevel;
	}
	public String getTrainingIntensity() {
		return trainingIntensity;
	}
	public void setTrainingIntensity(String trainingIntensity) {
		this.trainingIntensity = trainingIntensity;
	}
	public String getSchedule() {
		return Schedule;
	}
	public void setSchedule(String schedule) {
		Schedule = schedule;
	}
	public String getTrainingPlan() {
		return trainingPlan;
	}
	public void setTrainingPlan(String trainingPlan) {
		this.trainingPlan = trainingPlan;
	}
	
	
}
