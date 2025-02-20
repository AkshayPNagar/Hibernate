package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class car {
	@Id				// this will define identifier which mean primary key
	int c_num;
	
	String c_name;
	
	@Column(name= "c_owner_name")
	//If tables Column name are not match with this then Cloumn annotation is used
	String car_owner_name;
	String c_place_acc;
	
		public car()
		{
			
		}
		public car(int c_num, String c_name, String car_owner_name, String c_place_acc) 
	{
		super();
		this.c_num = c_num;
		this.c_name = c_name;
		this.car_owner_name = car_owner_name;
		this.c_place_acc = c_place_acc;
	}



		public int getC_num() {
			return c_num;
		}



		public void setC_num(int c_num) {
			this.c_num = c_num;
		}



		public String getC_name() {
			return c_name;
		}



		public void setC_name(String c_name) {
			this.c_name = c_name;
		}



		public String getCar_owner_name() {
			return car_owner_name;
		}



		public void setCar_owner_name(String car_owner_name) {
			this.car_owner_name = car_owner_name;
		}



		public String getC_place_acc() {
			return c_place_acc;
		}



		public void setC_place_acc(String c_place_acc) {
			this.c_place_acc = c_place_acc;
		}



		@Override
		public String toString() {
			return "car [c_num=" + c_num + ", c_name=" + c_name + ", car_owner_name=" + car_owner_name
					+ ", c_place_acc=" + c_place_acc + "]";
		}
		
		
}



	



		
