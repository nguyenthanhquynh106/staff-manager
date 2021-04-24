package com.quynh.dev.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {

	@Id
	@Column(length = 10)
	private String id;

	@Column(length = 50)
	private String name;

	@Column
	private Long basicSalary;

	@Column
	private Long subSalary;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
	private Set<Staff> staffs;

	public Role() {
	}

	public Role(String id, String name, Long basicSalary, Long subSalary) {
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.subSalary = subSalary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Long basicSalary) {
		this.basicSalary = basicSalary;
	}

	public Long getSubSalary() {
		return subSalary;
	}

	public void setSubSalary(Long subSalary) {
		this.subSalary = subSalary;
	}

	public Set<Staff> getStaffs() {
		return staffs;
	}

	public void setStaffs(Set<Staff> staffs) {
		this.staffs = staffs;
	}

}
