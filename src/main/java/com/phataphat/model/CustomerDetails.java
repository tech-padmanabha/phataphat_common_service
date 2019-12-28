package com.phataphat.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "customer_details")
//@Audited
public class CustomerDetails implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "reg-ui")
	@GenericGenerator(name = "reg-ui",strategy = "uuid")
	@Column(name="customer_id")
	private String customerId;
	@Column(name="customer_name")
	private String customerName;
	@Column(name="contact_no")
	private String contactNo;
	@Column(name="email_id")
	private String emailId;
	@Column(name="altr_contact_no")
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
		return "CustomerDetails [customerId=" + customerId + ", customerName=" + customerName + ", contactNo="
				+ contactNo + ", emailNo=" + emailId + ", alternateContactNo=" + alternateContactNo + ", age=" + age
				+ ", gender=" + gender + ", dob=" + dob + "]";
	}
	
	
	
}
