package com.xpanxion.DAO;

import java.util.List;

import com.xpanxion.model.Events;

public interface EventDAO {
	
	public void addEvent(Events event);



	public void updateEvent(Events event);







	public List<Events> listEvents();

}
