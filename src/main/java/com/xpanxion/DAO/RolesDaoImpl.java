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

import com.xpanxion.model.Roles;


@Repository
public class RolesDaoImpl implements RolesDao {
	private static final Logger logger = LoggerFactory.getLogger(RolesDaoImpl.class);
	@Autowired
		private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addRole(Roles roles) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(roles);
		JOptionPane optionPane = new JOptionPane();

		optionPane.setMessage("Role was added successfully.");
		JDialog dialog1 = optionPane.createDialog("Success");

		dialog1.setAlwaysOnTop(true);
		dialog1.setVisible(true);
		logger.info("Role saved successfully, Role Details="+roles);
		
	}

	public void updateRole(Roles roles) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(roles);
		JOptionPane optionPane = new JOptionPane();

		optionPane.setMessage("Role was updated successfully.");
		JDialog dialog1 = optionPane.createDialog("Success");

		dialog1.setAlwaysOnTop(true);
		dialog1.setVisible(true);
		logger.info("Role updated successfully, Role Details="+roles);
		
	}

	public List<Roles> listRoles() {
		System.out.println("DAO called");	
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Session created");	
//        	@SuppressWarnings("unchecked")
        	List<Roles> rolesList =  (List<Roles>)session.createQuery("from Roles").list();
        	System.out.println("List generated");	
            for(Roles s : rolesList){
       			System.out.println(s.getRoleName());
             logger.info("Employee List::"+s);
             }
        return rolesList;
	}
	
	

	public Roles getRoleById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Roles role = (Roles) session.load(Roles.class, new Integer(id));
		logger.info("Role loaded successfully, roles details="+role);
		return role;
	}

	public void removeRole(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Roles role = (Roles) session.load(Roles.class, new Integer(id));
		if(null != role){
			session.delete(role);
		}
		logger.info("Role deleted successfully, person details="+role);
		JOptionPane optionPane = new JOptionPane();

		optionPane.setMessage("Role was deleted successfully.");
		JDialog dialog1 = optionPane.createDialog("Success");

		dialog1.setAlwaysOnTop(true);
		dialog1.setVisible(true);
	}

}
