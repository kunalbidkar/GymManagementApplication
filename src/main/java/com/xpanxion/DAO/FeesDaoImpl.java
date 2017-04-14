package com.xpanxion.DAO;

import java.util.List;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xpanxion.model.Fees;
import com.xpanxion.model.Scheme;

@Repository
public class FeesDaoImpl implements FeesDao{
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void addFees(Fees fees) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(fees);		
		JOptionPane optionPane = new JOptionPane();

		optionPane.setMessage("Fees added successfully.");
		JDialog dialog1 = optionPane.createDialog("Success");

		dialog1.setAlwaysOnTop(true);
		dialog1.setVisible(true);
	}

	public List<Fees> listFees(int custId) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "FROM Fees WHERE custId ="+custId;
		//List<Fees> ListFees =  (List<Fees>)session.createQuery(hql).list();
   Query query = session.createQuery(hql);
   System.out.println("yhjnukirtvgf");
   //query.setParameter("custId", custId);
   List<Fees> ListFees =query.list();
   System.out.println(ListFees);
		return ListFees;
	}
	
	public List<Fees> listMonthlyFees(String month) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "FROM Fees where month="+"'"+month+"'";
		//List<Fees> ListFees =  (List<Fees>)session.createQuery(hql).list();
	   Query query = session.createQuery(hql);
	   System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	   //query.setParameter("custId", custId);
	   List<Fees> ListFees =query.list();
	   System.out.println(ListFees);
		return ListFees;
	}
}
