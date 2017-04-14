package com.xpanxion.DAO;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.xpanxion.model.DietPlan;

@Repository
public class DietPlanDaoImpl implements DietPlanDao {


	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addDiet(DietPlan d) {
		System.out.println("Dao called");
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Session created\n Data about to be saved");
		session.persist(d);
		
		JOptionPane optionPane = new JOptionPane();

		optionPane.setMessage("Diet plan added successfully.");
		JDialog dialog1 = optionPane.createDialog("Success");

		dialog1.setAlwaysOnTop(true);
		dialog1.setVisible(true);
		System.out.println("Data saved");
	}

	public void upadateDiet(DietPlan d) {
		// TODO Auto-generated method stub
		System.out.println("Dao called");
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Session created\n Data about to be updated");
		session.update(d);
		JOptionPane optionPane = new JOptionPane();

		optionPane.setMessage("Diet plan updated successfully.");
		JDialog dialog1 = optionPane.createDialog("Success");

		dialog1.setAlwaysOnTop(true);
		dialog1.setVisible(true);
		System.out.println("Data updated");
	}

	public List<DietPlan> listDiet() {
		// TODO Auto-generated method stub
		System.out.println("Dao called list");
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<DietPlan> dietList = session.createQuery("from DietPlan").list();
		for (DietPlan dplan : (List<DietPlan>) dietList) {
			System.out.println (dplan.getDinner());
		}

		return dietList;
	}

}
