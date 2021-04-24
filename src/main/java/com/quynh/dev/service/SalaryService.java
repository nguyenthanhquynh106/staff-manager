package com.quynh.dev.service;

import java.util.List;
import java.util.Optional;

import com.quynh.dev.model.Salary;
import com.quynh.dev.model.Staff;

public interface SalaryService {

	void deleteAll();

	void deleteAll(List<Salary> entities);

	void delete(Salary entity);

	void deleteById(String id);

	long count();

	List<Salary> findAllById(List<String> ids);

	Iterable<Salary> findAll();

	boolean existsById(String id);

	Optional<Salary> findById(String id);

	List<Salary> saveAll(List<Salary> entities);

	Salary save(Salary entity);

	List<Staff> findAllStaff();

}
