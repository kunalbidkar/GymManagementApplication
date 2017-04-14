package com.xpanxion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xpanxion.DAO.EventDAO;

import com.xpanxion.model.Events;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	EventDAO eventdao;

	public EventDAO getEventdao() {
		return eventdao;
	}

	public void setEventdao(EventDAO eventdao) {
		this.eventdao = eventdao;
	}

	@Transactional
	public void addEvent(Events event) {

		System.out.println("SERVICE CALLED");
		this.eventdao.addEvent(event);

	}

	@Transactional
	public void updateEvent(Events event) {
		// TODO Auto-generated method stub
		System.out.println("SERVICE CALLED UPDate");
		this.eventdao.updateEvent(event);

	}

	@Transactional
	public List<Events> listEvents() {

		System.out.println("Service list called");
		return this.eventdao.listEvents();

	}

}
