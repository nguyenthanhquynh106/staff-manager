package com.quynh.dev.dto;

public class RoleDTO {

	private String id;
	private String name;
	private Long basicSalary;
	private Long subSalary;

	public RoleDTO() {
	}

	public RoleDTO(String id, String name, Long basicSalary, Long subSalary) {
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

}
