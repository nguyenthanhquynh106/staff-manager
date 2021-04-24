package com.quynh.dev.dto;

public class DepartDTO {

	private String id;
	private String name;
	private Long numberStaffs;

	public DepartDTO() {
		super();
	}

	public DepartDTO(String id, String name, Long numberStaffs) {
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

}
