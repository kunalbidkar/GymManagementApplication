package com.xpanxion.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
	
		@Id
		@Column(name="cust_Id")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int cust_Id;
		
		@Column( name="Fname")
		private String first_Name;
		
		@Column( name="Lname")
		private String last_Name;
		
		@Column( name="Mname")
		private String middle_Name;
		
		@Column(name="Gender")
		private String gender;
		
		@Column( name="CONTACTNO")
		private String contact_No;
		
		@Column( name="email")
		private String email;
		

		@Column(name="address")
		private String address;
		
		@Column(name="IdentityProofType")
		private String identity_Proof_Type;
		
		@Column(name="IdentityProofNo")
		private String identity_Proof_No;
		
		@ManyToOne
		@JoinColumn(name="empId", nullable=false)
		private Employee employee;
		
		
		@ManyToOne
		@JoinColumn(name="workoutId", nullable=false)
		private WorkoutType wType;
		
		@ManyToOne
		@JoinColumn(name="durationId", nullable=false)
		private Duration durationType;
		
//		@OneToMany(mappedBy="custmap")
//		private Set<CustHStats> custmapid;
		
		
		@ManyToOne
		@JoinColumn(name="dietPlanId", nullable=false)
		private DietPlan dietPlanID;
		
		@ManyToOne
		@JoinColumn(name="workoutplanId",nullable=false)
		private WorkoutPlan custWorkoutPlan;
		
		
		
		
		
		

        

		

		
		


		public WorkoutPlan getCustWorkoutPlan() {
			return custWorkoutPlan;
		}

		public void setCustWorkoutPlan(WorkoutPlan custWorkoutPlan) {
			this.custWorkoutPlan = custWorkoutPlan;
		}

		public DietPlan getDietPlanID() {
			return dietPlanID;
		}

		public void setDietPlanID(DietPlan dietPlanID) {
			this.dietPlanID = dietPlanID;
		}

		public Duration getDurationType() {
			return durationType;
		}

		public void setDurationType(Duration durationType) {
			this.durationType = durationType;
		}

		public String getEmail() {
			return email;
		}

		public WorkoutType getwType() {
			return wType;
		}

		public void setwType(WorkoutType wType) {
			this.wType = wType;
		}

		public Employee getEmployee() {
			return employee;
		}

		public void setEmployee(Employee employee) {
			this.employee = employee;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		public int getCust_Id() {
			return cust_Id;
		}

		public void setCust_Id(int cust_Id) {
			this.cust_Id = cust_Id;
		}

		public String getFirst_Name() {
			return first_Name;
		}

		public void setFirst_Name(String first_Name) {
			this.first_Name = first_Name;
		}

		public String getLast_Name() {
			return last_Name;
		}

		public void setLast_Name(String last_Name) {
			this.last_Name = last_Name;
		}

		public String getMiddle_Name() {
			return middle_Name;
		}

		public void setMiddle_Name(String middle_Name) {
			this.middle_Name = middle_Name;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		
		

		
		public String getContact_No() {
			return contact_No;
		}

		public void setContact_No(String contact_No) {
			this.contact_No = contact_No;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getIdentity_Proof_Type() {
			return identity_Proof_Type;
		}

		public void setIdentity_Proof_Type(String identity_Proof_Type) {
			this.identity_Proof_Type = identity_Proof_Type;
		}

		public String getIdentity_Proof_No() {
			return identity_Proof_No;
		}

		public void setIdentity_Proof_No(String identity_Proof_No) {
			this.identity_Proof_No = identity_Proof_No;
		}



	
		
		
		

}
