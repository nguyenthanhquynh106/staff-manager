package com.quynh.dev.dto;

public class SalaryDTO {

	private String id;
	private Float salaryFactor;
	private String staffId;

	public SalaryDTO() {
	}

	public SalaryDTO(String id, Float salaryFactor, String staffId) {
		this.id = id;
		this.salaryFactor = salaryFactor;
		this.staffId = staffId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Float getSalaryFactor() {
		return salaryFactor;
	}

	public void setSalaryFactor(Float salaryFactor) {
		this.salaryFactor = salaryFactor;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

}
