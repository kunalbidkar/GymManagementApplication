package com.xpanxion.DAO;

import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xpanxion.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// private static final Logger logger =
	// LoggerFactory.getLogger(CustomerDAOImpl.class);
	// @Autowired
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}


	public void addCustomer(Customer c) {
		// TODO Auto-generated method stub
		System.out.println("Dao called");

		System.out.println("Session created\n Data about to be saved");
	
		JOptionPane optionPane1 = new JOptionPane();
		JOptionPane optionPane3 = new JOptionPane();
		String number =  c.getContact_No();
		System.out.println(number);
		boolean v=Pattern.matches("[789]{1}[0-9]{9}", number);
		if(!v)
		{
			optionPane1 = new JOptionPane();
			optionPane1.setMessage("Please enter a valid phone number.");
			JDialog dialog1 = optionPane1.createDialog("Failure");

			dialog1.setAlwaysOnTop(true);
			dialog1.setVisible(true);
		}
		


//		
//
	else {
		Session session1 = this.sessionFactory.getCurrentSession();
		session1.persist(c);
		optionPane3 = new JOptionPane();
		optionPane3.setMessage("Successfully saved customer records.");
		JDialog dialog2 = optionPane3.createDialog("Success");

		dialog2.setAlwaysOnTop(true);
		dialog2.setVisible(true);
	}

	}

	public void updateCustomer(Customer c) {
		System.out.println("Dao called");

		System.out.println("Session created\n Data about to be saved");
	
		JOptionPane optionPane1 = new JOptionPane();
		JOptionPane optionPane3 = new JOptionPane();
		String number =  c.getContact_No();
		System.out.println(number);
		boolean v=Pattern.matches("[789]{1}[0-9]{9}", number);
		if(!v)
		{
			optionPane1 = new JOptionPane();
			optionPane1.setMessage("Please enter a valid phone number.");
			JDialog dialog1 = optionPane1.createDialog("Failure");

			dialog1.setAlwaysOnTop(true);
			dialog1.setVisible(true);
		}
		


//		
//
	else {
		Session session1 = this.sessionFactory.getCurrentSession();
		session1.update(c);
		optionPane3 = new JOptionPane();
		optionPane3.setMessage("Successfully saved customer records.");
		JDialog dialog2 = optionPane3.createDialog("Success");

		dialog2.setAlwaysOnTop(true);
		dialog2.setVisible(true);
	}
		System.out.println("Data update");
		// logger.info("Customer saved successfully, Customer Details="+c);
	}

	public List<Customer> listCustomer() {

		System.out.println("Dao called list");
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Session created");
		@SuppressWarnings("unchecked")
		List<Customer> list = session.createQuery("from Customer").list();

	

		return list;
	}

	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		System.out.println("Dao called getId");
		Session session = this.sessionFactory.getCurrentSession();

		final Customer customer = (Customer) session.load(Customer.class, id);
		Hibernate.initialize(customer);

		return customer;
	}

	public void trainerdietUpdate(int cust_Id, int dietPlanID) {
		// TODO Auto-generated method stub

		System.out.println("In DAO");
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println(cust_Id + " " + dietPlanID);

		String hql = "UPDATE Customer set dietPlanId = :dietPlanID  " + "WHERE cust_Id = :cust_Id ";

		Query query = (Query) session.createQuery(hql);
		query.setParameter("dietPlanID", dietPlanID);
		query.setParameter("cust_Id", cust_Id);
		query.executeUpdate();
		JOptionPane optionPane = new JOptionPane();
		optionPane.setMessage("Diet updated successfully.");
		JDialog dialog = optionPane.createDialog("Success");

		dialog.setAlwaysOnTop(true);
		dialog.setVisible(true);

		System.out.println("Customer updated");

		// logger.info("Role saved successfully, Role Details="+scheme);

	}

	@Transactional
	public void trainerworkoutUpdate(int cust_Id, int workoutplanId) {
		// TODO Auto-generated method stub
		System.out.println("In DAO");
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println(cust_Id + " xzvbvfxdfb" + workoutplanId);

		String hql = "UPDATE Customer set workoutplanId = :workoutplanId  " + "WHERE cust_Id = :cust_Id ";

		Query query = (Query) session.createQuery(hql);
		query.setParameter("workoutplanId", workoutplanId);
		query.setParameter("cust_Id", cust_Id);
		query.executeUpdate();

		JOptionPane optionPane = new JOptionPane();
		optionPane.setMessage("Workout updated successfully.");
		JDialog dialog = optionPane.createDialog("Success");

		dialog.setAlwaysOnTop(true);
		dialog.setVisible(true);

		System.out.println("Customer updated");
	}

@Transactional
	public List<Customer> listCustomers(String id) {
		System.out.println("Dao called list");
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Session created");
		@SuppressWarnings("unchecked")
		List<Customer> list = session.createQuery("from Customer").list();

	System.out.println(list.size());

		return list;
	}

}
