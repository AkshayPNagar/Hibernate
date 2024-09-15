package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Teacher {
	@Id
	int t_id;
	public Teacher(int t_id, String t_name, String t_address, String t_department) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.t_address = t_address;
		this.t_department = t_department;
	}
	String t_name;
	String t_address;
	String t_department;
	
	@Override
	public String toString() {
		return "Teacher [t_id=" + t_id + ", t_name=" + t_name + ", t_address=" + t_address + ", t_department="
				+ t_department + "]";
	}
	public Teacher() {
		super();
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getT_address() {
		return t_address;
	}
	public void setT_address(String t_address) {
		this.t_address = t_address;
	}
	public String getT_department() {
		return t_department;
	}
	public void setT_department(String t_department) {
		this.t_department = t_department;
	}

}
