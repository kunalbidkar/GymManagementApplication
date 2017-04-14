package com.xpanxion.DAO;

import java.util.List;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.xpanxion.model.Scheme;

public class SchemeDaoImpl implements SchemeDao {

	private static final Logger logger = LoggerFactory.getLogger(RolesDaoImpl.class);
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	private SessionFactory sessionFactory;

	
	@Transactional
	public void addScheme(Scheme scheme) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(scheme);
		JOptionPane optionPane = new JOptionPane();

		optionPane.setMessage("Scheme added successfully.");
		JDialog dialog1 = optionPane.createDialog("Success");

		dialog1.setAlwaysOnTop(true);
		dialog1.setVisible(true);
		logger.info("Role saved successfully, Role Details="+scheme);
	}
	@Transactional
	public void updateScheme(Scheme scheme,int price) {
		System.out.println("In DAO" + price+scheme.getSchemeId());
		Session session = this.sessionFactory.getCurrentSession();
		/*System.out.println("Session created");	
//        	@SuppressWarnings("unchecked")
        	session.createQuery("from Scheme");*/
        	
        	
        	String hql = "UPDATE Scheme set price = :price "  + 
                    "WHERE schemeId = :id";
       Query query = session.createQuery(hql);
       query.setParameter("price", price);
       query.setParameter("id", scheme.getSchemeId());
       int result = query.executeUpdate();
        	
       JOptionPane optionPane = new JOptionPane();

		optionPane.setMessage("Scheme updated successfully.");
		JDialog dialog1 = optionPane.createDialog("Success");

		dialog1.setAlwaysOnTop(true);
		dialog1.setVisible(true);
        	System.out.println("Scheme updated");	
        
		//logger.info("Role saved successfully, Role Details="+scheme);
	}
	@Transactional
	public List<Scheme> listScheme() {
		System.out.println("DAO called");	
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Session created");	
//        	@SuppressWarnings("unchecked")
        	List<Scheme> SchemeList =  (List<Scheme>)session.createQuery("from Scheme").list();
        	System.out.println("List generated");	
            
       		for(Scheme s : SchemeList){
       			System.out.println(s.getSchemeId());
             logger.info("Employee List::"+s);

        }
        return SchemeList;
	}

}
