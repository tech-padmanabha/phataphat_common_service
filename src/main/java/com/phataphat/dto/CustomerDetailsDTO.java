package com.phataphat.dto;

import java.time.LocalDate;

public class CustomerDetailsDTO{
	private String customerId;
	private String customerName;
	private String contactNo;
	private String emailId;
	private String alternateContactNo;
	private String age;
	private String gender;
	private LocalDate dob;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAlternateContactNo() {
		return alternateContactNo;
	}
	public void setAlternateContactNo(String alternateContactNo) {
		this.alternateContactNo = alternateContactNo;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "CustomerDetailsDTO [customerId=" + customerId + ", customerName=" + customerName + ", contactNo="
				+ contactNo + ", emailId=" + emailId + ", alternateContactNo=" + alternateContactNo + ", age=" + age
				+ ", gender=" + gender + ", dob=" + dob + "]";
	}
	
	
}
