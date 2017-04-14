package com.xpanxion.model;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="DietPlan")
public class DietPlan {

      @Id
      @Column(name="dietPlanId")
      @GeneratedValue(strategy=GenerationType.IDENTITY)
      private int dietPlanId;
      
      private String breakfast;
      
      private String lunch;
      
      private String dinner;
      
     
      
      @OneToMany(mappedBy="dietPlanID")
      private Set<Customer> customerdiet;
      
      
      
      
      
     
	public Set<Customer> getCustomerdiet() {
		return customerdiet;
	}

	public void setCustomerdiet(Set<Customer> customerdiet) {
		this.customerdiet = customerdiet;
	}

	public int getDietPlanId() {
            return dietPlanId;
      }

      public void setDietPlanId(int dietPlanId) {
            this.dietPlanId = dietPlanId;
      }

      public String getBreakfast() {
            return breakfast;
      }

      public void setBreakfast(String breakfast) {
            this.breakfast = breakfast;
      }

      public String getLunch() {
            return lunch;
      }

      public void setLunch(String lunch) {
            this.lunch = lunch;
      }

      public String getDinner() {
            return dinner;
      }

      public void setDinner(String dinner) {
            this.dinner = dinner;
      }

	
	

}
