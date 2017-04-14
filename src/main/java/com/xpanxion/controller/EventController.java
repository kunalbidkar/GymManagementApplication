package com.xpanxion.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xpanxion.model.Customer;
import com.xpanxion.model.Events;
import com.xpanxion.service.EventService;



@Controller//("/Events")
public class EventController {
	
	@Autowired
	private EventService eventService;

	public EventService getEventService() {
		return eventService;
	}

	public void setEventService(EventService eventService) {
		this.eventService = eventService;
	}
	
	//add and update
	@RequestMapping(value = "/Event", method = RequestMethod.POST)
	public ModelAndView addEvent(Events event, HttpServletRequest request) {
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Front Desk Executive")){
			System.out.println("Controller called"+event.getEvent_Id());
		
		//ModelAndView m = new ModelAndView();
		if (event.getEvent_Id()==0) {
			// new Customer, add it
			
			this.eventService.addEvent(event);
			System.out.println(event.getEvent_desc());
			//m.setViewName("Edit");

		} else {
		//	existing Customer, call update
			this.eventService.updateEvent(event);
			model.setViewName("EditOffers");
		}
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}
	@RequestMapping(value = "/updateEvent", method = RequestMethod.POST)
	public ModelAndView update(Events event, HttpServletRequest request){
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Front Desk Executive")){
		System.out.println(event.getEvent_Id());
			this.eventService.updateEvent(event);
		model.setViewName("fdeHome");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}
	@RequestMapping(value = "/redirectupdateOffer", method = RequestMethod.POST)
	public ModelAndView redirectToUpadateOffer(Events c, HttpServletRequest request) {
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Front Desk Executive")){
		//	ModelAndView m = new ModelAndView();
		
		List<Events> listEvent=this.eventService.listEvents();
		model.addObject("eventList", listEvent);
		System.out.println(listEvent.size());
		model.setViewName("EditOffers");
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
		return model;
	}
	
	@RequestMapping(value = "/redirectOfferEvent", method = RequestMethod.POST)
	public ModelAndView redirectToUpadateOfferEvent(Events c) {
		ModelAndView m = new ModelAndView();

		m.setViewName("Event");
		return m;
	}
//	@RequestMapping(value = "/redirectListOffer", method = RequestMethod.POST)
//	public ModelAndView redirectToListOffer(Events c) {
//		ModelAndView m = new ModelAndView();
//
//		m.setViewName("ListOffers");
//		return m;
//	}
	
	@RequestMapping(value = "/redirectListOffer")
    public ModelAndView listEvent() {
          System.out.println("Controller called for list");
          List<Events> listEvents = eventService.listEvents();
          System.out.println(listEvents.size());
          ModelAndView model = new ModelAndView();
          model.addObject("listEvents", listEvents);
          model.setViewName("ListOffers");
         
          return model;
    }

	@RequestMapping(value = "/viewEvents")
    public ModelAndView listEvents(HttpServletRequest request) {
		ModelAndView model= new ModelAndView();
		if(request.getSession().getAttribute("role").equals("Customer")){
			System.out.println("Controller called for list");
		
         List<Events> listEvents = eventService.listEvents();
         System.out.println(listEvents.size());
        // ModelAndView model = new ModelAndView();
         model.addObject("listEvents", listEvents);
		}
		else{
			model.setViewName("Error");
			request.getSession().setAttribute("role","");
	}
         return model;
	}

}
