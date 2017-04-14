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
public class Duration {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int durationId;
	@Column
	private String durationPlan;
	public int getDurationId() {
		return durationId;
	}
	public void setDurationId(int durationId) {
		this.durationId = durationId;
	}
	public String getDurationPlan() {
		return durationPlan;
	}
	public void setDurationPlan(String durationPlan) {
		this.durationPlan = durationPlan;
	}
	@OneToMany(mappedBy="duration")
	private Set<Scheme> scheme;
	public Set<Scheme> getScheme() {
		return scheme;
	}
	public void setScheme(Set<Scheme> scheme) {
		this.scheme = scheme;
	}
}