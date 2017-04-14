package com.xpanxion.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="schemes")
public class Scheme {
	@Id
	@Column(name="scheme_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int schemeId;
	@Column
	private int price;
	
	
	@ManyToOne
	@JoinColumn(name="workoutId", nullable=false)
	private WorkoutType workoutType;
	
	@ManyToOne
	@JoinColumn(name="durationId", nullable=false)
	private Duration duration;
	
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Scheme [schemeId=" + schemeId + ", workoutType=" + workoutType + ", price=" + price + "]";
	}
	public int getSchemeId() {
		return schemeId;
	}
	public void setSchemeId(int schemeId) {
		this.schemeId = schemeId;
	}
	public int getPrice() {
		return price;
	}
	public WorkoutType getWorkoutType() {
		return workoutType;
	}
	public void setWorkoutType(WorkoutType workoutType) {
		this.workoutType = workoutType;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@OneToMany(mappedBy="scheme")
	private Set<Fees> fees;
	
	

	public Set<Fees> getFees() {
		return fees;
	}
	public void setFees(Set<Fees> fees) {
		this.fees = fees;
	}


}
