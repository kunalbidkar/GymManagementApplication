package com.xpanxion.DAO;

import java.util.List;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


import com.xpanxion.model.WorkoutType;

public class WorkoutTypeDaoImpl implements WorkoutTypeDao{

	private static final Logger logger = LoggerFactory.getLogger(RolesDaoImpl.class);
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	public void addWorkoutType(WorkoutType wType) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(wType);
		JOptionPane optionPane = new JOptionPane();

		optionPane.setMessage("Workout type added successfully.");
		JDialog dialog1 = optionPane.createDialog("Success");

		dialog1.setAlwaysOnTop(true);
		dialog1.setVisible(true);
		logger.info("Role saved successfully, Role Details="+wType);
		
	}

	public List<WorkoutType> listWorkoutType() {
		System.out.println("DAO called");	
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Session created");	
//        	@SuppressWarnings("unchecked")
        	List<WorkoutType> workoutList =  (List<WorkoutType>)session.createQuery("from WorkoutType").list();
        	System.out.println("List generated");	
            
       		for(WorkoutType s : workoutList){
       			System.out.println(s.getWorkoutName());
             logger.info("Workout Type List::"+s);

        }
        return workoutList;
	}

	public void deleteWorkout(WorkoutType workout) {
		Session session = this.sessionFactory.getCurrentSession();
		//WorkoutType p = (WorkoutType)session.load(WorkoutType.class, new String(workoutName));
        if(null != workout){
              session.delete(workout);
        }
        JOptionPane optionPane = new JOptionPane();

		optionPane.setMessage("Workout type deleted successfully.");
		JDialog dialog1 = optionPane.createDialog("Success");

		dialog1.setAlwaysOnTop(true);
		dialog1.setVisible(true);
	}

}
