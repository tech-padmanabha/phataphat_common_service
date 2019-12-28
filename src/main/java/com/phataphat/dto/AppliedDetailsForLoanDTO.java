package com.phataphat.dto;

public class AppliedDetailsForLoanDTO extends BaseDTO{
	private String applName;

	public String getApplName() {
		return applName;
	}

	public void setApplName(String applName) {
		this.applName = applName;
	}

	@Override
	public String toString() {
		return "AppliedDetailsForLoanDTO [applName=" + applName + "]";
	}
	
}
