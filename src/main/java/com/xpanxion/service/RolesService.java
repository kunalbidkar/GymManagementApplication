package com.xpanxion.service;

import java.util.List;

import com.xpanxion.model.Roles;



public interface RolesService {
	public void addRole(Roles roles);
	public void updateRole(Roles roles);
	public List<Roles> listRoles();
	public Roles getRolesById(int id);
	public void removeRole(int id);
}
