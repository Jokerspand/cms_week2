package com.wkp.domain;



import java.util.Date;

//人的实体类
public class Person {

	private int id;
	private String name;
	private int age;
	private Date py;
	private double xc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getPy() {
		return py;
	}
	public void setPy(Date py) {
		this.py = py;
	}
	public double getXc() {
		return xc;
	}
	public void setXc(double xc) {
		this.xc = xc;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", py=" + py + ", xc=" + xc + "]";
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
