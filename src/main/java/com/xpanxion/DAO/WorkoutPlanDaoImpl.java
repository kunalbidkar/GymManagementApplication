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
import org.springframework.transaction.annotation.Transactional;

import com.xpanxion.model.WorkoutPlan;


@Repository
public class WorkoutPlanDaoImpl implements WorkoutPlanDao{
	private static final Logger logger = LoggerFactory.getLogger(RolesDaoImpl.class);
	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
@Transactional
	public void addWorkoutPlan(WorkoutPlan wPlan) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(wPlan);
		JOptionPane optionPane = new JOptionPane();

		optionPane.setMessage("Workout plan added successfully.");
		JDialog dialog1 = optionPane.createDialog("Success");

		dialog1.setAlwaysOnTop(true);
		dialog1.setVisible(true);
		logger.info("Role saved successfully, Role Details="+wPlan);
	}
@Transactional
	public List<WorkoutPlan> listWorkoutPlan() {
		System.out.println("DAO called");	
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Session created");	
//        	@SuppressWarnings("unchecked")
        	List<WorkoutPlan> workoutListPlan =  (List<WorkoutPlan>)session.createQuery("from WorkoutPlan").list();
        	System.out.println("List generated");	
            
       		for(WorkoutPlan s : workoutListPlan){
       			System.out.println(s.getTrainingPlan());
             logger.info("Workout Type List::"+s);

        }
        return workoutListPlan;
	}
@Transactional
	public void deleteWorkoutPlan(WorkoutPlan wPlan) {
		Session session = this.sessionFactory.getCurrentSession();
		WorkoutPlan plan = (WorkoutPlan)session.load(WorkoutPlan.class, new Integer(wPlan.getWorkoutplanId()));
        if(null != wPlan){
              session.delete(plan);
        }
        JOptionPane optionPane = new JOptionPane();

		optionPane.setMessage("Workout plan deleted successfully.");
		JDialog dialog1 = optionPane.createDialog("Success");

		dialog1.setAlwaysOnTop(true);
		dialog1.setVisible(true);
	}

	
}
