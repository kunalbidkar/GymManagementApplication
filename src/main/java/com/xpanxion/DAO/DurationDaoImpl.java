package com.xpanxion.DAO;

import java.util.List;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.xpanxion.model.Duration;


@Repository
public class DurationDaoImpl implements DurationDao{

	
	@Autowired
	private SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(RolesDaoImpl.class);
	
	
	public void addDuration(Duration duration) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(duration);
		JOptionPane optionPane = new JOptionPane();

		optionPane.setMessage("Duration added successfully.");
		JDialog dialog1 = optionPane.createDialog("Success");

		dialog1.setAlwaysOnTop(true);
		dialog1.setVisible(true);
		logger.info("Role saved successfully, Role Details="+duration);	
	}

	public List<Duration> listDuration() {
		System.out.println("DAO called");	
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Session created");	
//        	@SuppressWarnings("unchecked")
        	List<com.xpanxion.model.Duration> durationList =  (List<Duration>)session.createQuery("from Duration").list();
        	System.out.println("List generated");	
            
       		for(Duration s : durationList){
       			System.out.println(s.getDurationPlan());
             logger.info("Workout Type List::"+s);

        }
        return durationList;
	}

	public void deleteDuration(Duration duration) {
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("DAO!@!##@!#!@#!");
		Duration d = (Duration) session.load(Duration.class, new Integer(duration.getDurationId()));
		//WorkoutType p = (WorkoutType)session.load(WorkoutType.class, new String(workoutName));
        
              session.delete(d);
              JOptionPane optionPane = new JOptionPane();

      		optionPane.setMessage("Duration deleted successfully.");
      		JDialog dialog1 = optionPane.createDialog("Success");

      		dialog1.setAlwaysOnTop(true);
      		dialog1.setVisible(true);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}