package com.xpanxion.service;

import java.util.List;

import com.xpanxion.model.Events;

public interface EventService {
	
	public void addEvent(Events event);

	

	public void updateEvent(Events event);



	public List<Events> listEvents();

}
