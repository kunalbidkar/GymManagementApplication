package com.xpanxion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="event")
public class Events {
	
		@Id
		@Column(name="event_Id")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int event_Id;
		
		@Column(name="event_name")
		private String event_Name;
		
		@Column(name="event_desc")
		private String event_desc;

		public int getEvent_Id() {
			return event_Id;
		}

		public void setEvent_Id(int event_Id) {
			this.event_Id = event_Id;
		}

		public String getEvent_Name() {
			return event_Name;
		}

		public void setEvent_Name(String event_Name) {
			this.event_Name = event_Name;
		}

		public String getEvent_desc() {
			return event_desc;
		}

		public void setEvent_desc(String event_desc) {
			this.event_desc = event_desc;
		}
		
		
}
		