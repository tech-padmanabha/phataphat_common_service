package com.phataphat.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@AttributeOverride(name="id",column = @Column (name="appli_id" ,nullable = false))
@Table(name="application_details_loan")
public class AppliedDetailsForLoan extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String applName;

	public AppliedDetailsForLoan() {
		super();
	}

	public String getApplName() {
		return applName;
	}

	public void setApplName(String applName) {
		this.applName = applName;
	}

	@Override
	public String toString() {
		return "AppliedDetailsForLoan [applName=" + applName + "]";
	}
	
	

}
