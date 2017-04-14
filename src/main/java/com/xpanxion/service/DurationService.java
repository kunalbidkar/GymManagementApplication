package com.xpanxion.service;

import java.util.List;

import com.xpanxion.model.Duration;


public interface DurationService {
	public void addDuration(Duration d);
	public List<Duration> listDuration(); 
	public void deleteDuration(Duration duration);

}
