package com.xpanxion.DAO;

import java.util.List;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xpanxion.model.Customer;
import com.xpanxion.model.Events;
@Repository
public class EventDAOImpl implements EventDAO{
    
	@Autowired
	SessionFactory sessionFactory; 
	public void addEvent(Events event) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("Dao called");
				Session session = this.sessionFactory.getCurrentSession();
				System.out.println("Session created\n Data about to be saved");
				session.persist(event);
				JOptionPane optionPane = new JOptionPane();

				optionPane.setMessage("Event added successfully.");
				JDialog dialog1 = optionPane.createDialog("Success");

				dialog1.setAlwaysOnTop(true);
				dialog1.setVisible(true);
				System.out.println("Data saved");
				//logger.info("Customer saved successfully, Customer Details="+c);v
		
	}
	public void updateEvent(Events event) {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("update Events set event_desc=:desc where event_Id=:Id");
		q.setString("desc", event.getEvent_desc());
		q.setInteger("Id", event.getEvent_Id());
		q.executeUpdate();
		JOptionPane optionPane = new JOptionPane();

		optionPane.setMessage("Event updated successfully.");
		JDialog dialog1 = optionPane.createDialog("Success");

		dialog1.setAlwaysOnTop(true);
		dialog1.setVisible(true);
			// TODO Auto-generated method stub
			System.out.println("Dao called");
			
			System.out.println("Session created\n Data about to be upadted");
			//session.update(event);
			System.out.println("Data updated");
			//logger.info("Customer saved successfully, Customer Details="+c);
		}
	public List<Events> listEvents() {
		// TODO Auto-generated method stub
		System.out.println("Dao called list");
		Session session = this.sessionFactory.getCurrentSession();
			@SuppressWarnings("unchecked")
			List<Events> eventList = session.createQuery("from Events").list();
			for ( Events ctry : (List<Events>) eventList ) {
	            System.out.println( "Country (" + ctry.getEvent_desc()+""+ctry.getEvent_Name() );
	        }
			
		
			
			return eventList;
	}
		
	

}
