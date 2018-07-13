package com.kyyba.example.bean;

public class Membership {

	private String Name;
	private String Address;
	private int age;
	private String plan;
	private int planmonths;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public int getPlanmonths() {
		return planmonths;
	}
	public void setPlanmonths(int planmonths) {
		this.planmonths = planmonths;
	}
	
}
