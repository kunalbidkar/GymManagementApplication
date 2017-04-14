package com.xpanxion.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
public class Employee {
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", contact=" + contact + ", address=" + address + ", email=" + email + ", idtype=" + idtype
				+ ", idnum=" + idnum + ", gender=" + gender + ", status=" + status + "]";
	}
	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	@Column
	private String fname;
	@Column
	private String mname;
	@Column
	private String lname;
	/*@Column
	private String dept;*/
	@Column
	private String contact;
	@Column
	private String address;
	@Column
	private String email;
	@Column
	private String idtype;
	@Column
	private String idnum;
	@Column
	private String gender;
	@Column(name="st")
	private String status;
	
	@ManyToOne
	@JoinColumn(name="roleId", nullable=false)
	private Roles roles;
	
	@OneToMany(mappedBy="employee")
	private Set<Customer> customer;
	
	public Set<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}
	public Roles getRoles() {
		return roles;
	}
	public void setRoles(Roles roles) {
		this.roles = roles;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
/*	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}*/
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdtype() {
		return idtype;
	}
	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}
	public String getIdnum() {
		return idnum;
	}
	public void setIdnum(String idnum) {
		this.idnum = idnum;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}

