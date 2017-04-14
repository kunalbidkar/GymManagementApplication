package com.xpanxion.service;

import java.util.List;


import com.xpanxion.DAO.*;
import com.xpanxion.model.Roles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RolesServiceImpl implements RolesService {
	@Autowired
	private RolesDao rolesDao;
    
	
	
	public RolesDao getRolesDao() {
		return rolesDao;
	}

	public void setRolesDao(RolesDao rolesDao) {
		this.rolesDao = rolesDao;
	}
	@Transactional
	public void removeRole(int id) {
		this.rolesDao.removeRole(id);

	}
	@Transactional
	public void addRole(Roles roles) {
		this.rolesDao.addRole(roles);
		
	}
	@Transactional
	public void updateRole(Roles roles) {
		this.rolesDao.updateRole(roles);

		
	}
	@Transactional
	public List<Roles> listRoles() {
		System.out.println("Service called for role list");
		return this.rolesDao.listRoles();

	}
	@Transactional
	public Roles getRolesById(int id) {
		return this.rolesDao.getRoleById(id);

	}

}
