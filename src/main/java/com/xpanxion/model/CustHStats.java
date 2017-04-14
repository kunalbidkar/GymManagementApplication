package com.xpanxion.model;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import com.joseph.model.Role;

@Entity
@Table
public class CustHStats {
@Id
@Column
@GeneratedValue(strategy=GenerationType.IDENTITY)
int custhid;
@Column
double ht;
@Column
double wt;
@Column
String date;

@Column
double bmi;
@Column
int cust_Id;
public int getCusthid() {
	return custhid;
}
public void setCusthid(int custhid) {
	this.custhid = custhid;
}
public double getHt() {
	return ht;
}
public void setHt(double ht) {
	this.ht = ht;
}
public double getWt() {
	return wt;
}
public void setWt(double wt) {
	this.wt = wt;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public double getBmi() {
	return bmi;
}
public void setBmi(double bmi) {
	this.bmi = bmi;
}
public int getCust_Id() {
	return cust_Id;
}
public void setCust_Id(int cust_Id) {
	this.cust_Id = cust_Id;
}


//@ManyToOne(fetch = FetchType.EAGER)
//@JoinColumn(name="cust_Id", nullable=false)
//private Customer customer;


//@OneToOne(fetch = FetchType.EAGER)
//@JoinColumn(name="cust_Id", nullable=false)
//private Customer custmap1;

//
//@ManyToMany(cascade = {CascadeType.ALL})
//@JoinTable(name="CustHealth",
//		joinColumns=@JoinColumn(name="custhid"),
//		inverseJoinColumns=@JoinColumn(name="cust_Id"))
//private List<Customer> cust;


/*@OneToOne(fetch = FetchType.EAGER)
@JoinColumn(name="cust_Id", nullable=false)
private Customer custmap;*/

//new
//@OneToOne(fetch = FetchType.LAZY,mappedBy = "custmap",cascade = CascadeType.ALL)
//private Customer custHStats;






}
