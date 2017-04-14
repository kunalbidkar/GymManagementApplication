package com.xpanxion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Fees {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int paymentId;
	@Column
	private int custId;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	@Column
	private String date;
	@ManyToOne
	@JoinColumn(name="scheme_Id", nullable=false)
	private Scheme scheme;
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Scheme getScheme() {
		return scheme;
	}
	public void setScheme(Scheme scheme) {
		this.scheme = scheme;
	}
	
	@Column
	private String month;
	
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	
}
