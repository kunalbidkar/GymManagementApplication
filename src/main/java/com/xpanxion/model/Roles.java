package com.xpanxion.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Roles {
	public int getRoleId() {
		return roleId;
	}
	@Override
	public String toString() {
		return "Roles [roleId=" + roleId + ", roleName=" + roleName + "]";
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Id
	@Column(name="roleId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int roleId;
	public Set<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	@Column
	String roleName;
	
	@OneToMany(mappedBy="roles")
	private Set<Employee> employee;

	
	
	
	
}
