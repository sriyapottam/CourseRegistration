package com.example.Registration.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userdetails")
public class UserDetails {
    @Id
    
    @GeneratedValue(strategy=GenerationType.IDENTITY)


    private int  id;
    
	public int getId() {
		return id;
	}
	public void setId(int id2) {
		this.id = id2;
	}
	private String Name;
	
	private String Address;
	private String Age;
	private String Highestqualification;
	private String Course;
	private String Courseduration;
	private String Paymentmode;
	private String Password;
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
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getHighestqualification() {
		return Highestqualification;
	}
	public void setHighestqualification(String highestqualification) {
		Highestqualification = highestqualification;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public String getCourseduration() {
		return Courseduration;
	}
	public void setCourseduration(String courseduration) {
		Courseduration = courseduration;
	}
	public String getPaymentmode() {
		return Paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		Paymentmode = paymentmode;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "UserDetails [Name=" + Name + ", Address=" + Address + ", Age=" + Age + ", Highestqualification="
				+ Highestqualification + ", Course=" + Course + ", Courseduration=" + Courseduration + ", Paymentmode="
				+ Paymentmode + ", Password=" + Password + "]";
	}
	
	
	
	
	
}


