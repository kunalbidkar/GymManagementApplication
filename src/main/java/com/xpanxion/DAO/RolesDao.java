package com.xpanxion.DAO;

import java.util.List;

import com.xpanxion.model.Roles;



public interface RolesDao {
	public void addRole(Roles roles);
	public void updateRole(Roles roles);
	public List<Roles> listRoles();
	public Roles getRoleById(int id);
	public void removeRole(int id);

}
