package com.xpanxion.DAO;

import java.util.List;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.xpanxion.model.UserLogin;

public class UserLoginDaoImpl implements UserLoginDao{
	@Autowired
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
@Transactional
	public void adduser(UserLogin userLogin) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("Session created\n Data about to be saved");
		session.persist(userLogin);
		
	}
@Transactional
public UserLogin authenticate(UserLogin userLogin) {
	UserLogin user=null;
    String userType = null;
    try{
    Session session = this.sessionFactory.getCurrentSession();
    Query query = session.createQuery("from UserLogin where userName="+"'"+(userLogin.getUserName())+"'"+ " AND " +"password="+"'"+ (userLogin.getPassword())+"'");
    //User user1 = (User) session.get(User.class, user.getEmployee().getEmail());
     List<UserLogin> user1 = query.list();
    
    if (user1.equals(null)|| (user1.size()==0) ){
          return null;
    }else{
          //User is exist then return the role of that user
          //userType = user1.get(0).getRole().getRoleName();
          return user1.get(0);  
    }
    }
    catch(Exception e)
    {
    	JOptionPane optionPane = new JOptionPane();
		  JOptionPane optionPane1 = new JOptionPane();
		  //String name = roles.getRoleName();
		  
		   optionPane1 = new JOptionPane();
		   optionPane1.setMessage("Enter Valid credentials");
		   JDialog dialog1 = optionPane1.createDialog("Failure");

		   dialog1.setAlwaysOnTop(true);
		   dialog1.setVisible(true);
		   
		  return null;
    }
}

	
}
