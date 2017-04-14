package com.xpanxion.DAO;

import java.util.List;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xpanxion.model.CustHStats;
import com.xpanxion.model.Customer;

@Repository
public class CustHStatsDAOImpl implements CustHStatsDAO {
	@Autowired
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addStats(CustHStats chs) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(chs);
		JOptionPane optionPane = new JOptionPane();

		optionPane.setMessage("Customer Health Statistics added successfully.");
		JDialog dialog1 = optionPane.createDialog("Success");

		dialog1.setAlwaysOnTop(true);
		dialog1.setVisible(true);

	}

	public List<Customer> listCustomerHealthStats() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Customer> statsList = session.createQuery("from Customer").list();
		// for (CustHStats p : statsList) {

		return statsList;
	}

	public List<CustHStats> searchHealthStatsById(int c) {
		// TODO Auto-generated method stub
		System.out.println("In DAO");
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("dao");
		String hql = "FROM CustHStats WHERE cust_Id =" + c;
		Query query = session.createQuery(hql);

		@SuppressWarnings("unchecked")
		List<CustHStats> results = query.list();
		System.out.println(results);
		return results;

	}
}
