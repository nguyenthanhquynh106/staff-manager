package com.quynh.dev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "salaries")
public class Salary {

	@Id
	@Column(length = 10)
	private String id;

	@Column
	private Float salaryFactor;

	@OneToOne
	@JoinColumn(name = "staffId")
	private Staff staff;

	public Salary() {
	}

	public Salary(String id, Float salaryFactor, Staff staff) {
		this.id = id;
		this.salaryFactor = salaryFactor;
		this.staff = staff;
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

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

}
