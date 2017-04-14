package com.xpanxion.DAO;

import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xpanxion.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);
	@Autowired
	private SessionFactory sessionFactory;

	public void addEmployee(Employee e) {
		
		JOptionPane optionPane1 = new JOptionPane();
		JOptionPane optionPane3 = new JOptionPane();
		String number =  e.getContact();
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
		session1.saveOrUpdate(e);	
		optionPane3 = new JOptionPane();
		optionPane3.setMessage("Successfully saved customer records.");
		JDialog dialog2 = optionPane3.createDialog("Success");

		dialog2.setAlwaysOnTop(true);
		dialog2.setVisible(true);
	}
		
		
		
	

		
	}
	public List<Employee> listEmployeeTrainer() {
		// TODO Auto-generated method stub
		System.out.println("Dao called list");
		Session session = this.sessionFactory.getCurrentSession();
			@SuppressWarnings("unchecked")
			List<Employee> trainerList = session.createQuery("from Employee where roleId=1").list();
			for ( Employee ctry : (List<Employee>) trainerList ) {
	            System.out.println(  ctry.getRoles() );
	        }
			
		
			
			return trainerList;
	
	}

	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}



	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	public List<Employee> listActiveEmployee() {
		
        Session session = this.sessionFactory.getCurrentSession();
        Query query=(Query) session.createQuery("from Employee WHERE st= :status");
        query.setParameter("status","active");
        List<Employee> EmployeeList = query.list();
        
        
        for(Employee e : EmployeeList){
                        logger.info("Employee List::"+e);

	}
        return EmployeeList;
	}
	
	public List<Employee> listInActiveEmployee() {
		System.out.println("In inactive Dao1");
        Session session = this.sessionFactory.getCurrentSession();
        System.out.println("In inactive Dao2");
        Query query=(Query) session.createQuery("from Employee WHERE st= :status");
        query.setParameter("status","inactive");
        List<Employee> EmployeeList = query.list();
        
        
        for(Employee e : EmployeeList){
                        logger.info("Employee List::"+e);

	}
        return EmployeeList;
	}
	
	public List<Employee> listEmployee() {
		System.out.println("In inactive Dao1");
        Session session = this.sessionFactory.getCurrentSession();
        System.out.println("In inactive Dao2");
        Query query=(Query) session.createQuery("from Employee");
        List<Employee> EmployeeList = query.list();
        
        
        for(Employee e : EmployeeList){
                        logger.info("Employee List::"+e);

	}
        return EmployeeList;
	}


	@Transactional
	public List<Employee> listTrainer() {
		System.out.println("In inactive Dao1");
        Session session = this.sessionFactory.getCurrentSession();
        System.out.println("In inactive Dao2");
        Query query=(Query) session.createQuery("from Employee where roleId=3");
        List<Employee> EmployeeList = query.list();
        
        
        for(Employee e : EmployeeList){
                        logger.info("Employee List::"+e);

	}
        return EmployeeList;
        
	}
	
	/*public void viewEmployee(Employee e) {
		System.out.println("In DAO");
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Session created");	
//        	@SuppressWarnings("unchecked")
        	session.createQuery("from Scheme");
        	
        	
        	String hql = "SELECT empId,fname FROM Employee"  + 
                    "WHERE st=:status";
       Query query = session.createQuery(hql);
       query.setParameter("status", price);
       query.setParameter("workoutType", workoutType);
       int result = query.executeUpdate();
        	
        	
        	System.out.println("Scheme updated");	
        
		//logger.info("Role saved successfully, Role Details="+scheme);
		
	}*/
	public Employee getEmployeeById(int empId) {
		Session session = this.sessionFactory.getCurrentSession();
		Employee employee = (Employee) session.get(Employee.class, empId);
		return employee;
	}

}
