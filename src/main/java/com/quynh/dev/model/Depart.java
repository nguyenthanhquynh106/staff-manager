package com.quynh.dev.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departs")
public class Depart {

	@Id
	@Column(length = 10)
	private String id;

	@Column(length = 50)
	private String name;

	@Column
	private Long numberStaffs;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "depart")
	private Set<Staff> staffs;

	public Depart() {
	}

	public Depart(String id, String name, Long numberStaffs) {
		this.id = id;
		this.name = name;
		this.numberStaffs = numberStaffs;
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

	public Long getNumberStaffs() {
		return numberStaffs;
	}

	public void setNumberStaffs(Long numberStaffs) {
		this.numberStaffs = numberStaffs;
	}

	public Set<Staff> getStaffs() {
		return staffs;
	}

	public void setStaffs(Set<Staff> staffs) {
		this.staffs = staffs;
	}

}
