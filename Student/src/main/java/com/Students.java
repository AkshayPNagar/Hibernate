package com;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {
	@Id
	int Roll;
	String Name;
	String Address;
	@Column(name="Pre_marks")
	int Marks;
	
	
	public Students() {
		super();
	}
	public Students(int roll, String name, String address, int marks) {
		super();
		Roll = roll;
		Name = name;
		Address = address;
		Marks = marks;
	}
	@Override
	public String toString() {
		return "Students [Roll=" + Roll + ", Name=" + Name + ", Address=" + Address + ", Marks=" + Marks + "]";
	}
	public int getRoll() {
		return Roll;
	}
	public void setRoll(int roll) {
		Roll = roll;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}

}
