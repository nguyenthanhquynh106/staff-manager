package com.quynh.dev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.quynh.dev.model.Depart;
import com.quynh.dev.model.Role;
import com.quynh.dev.model.Staff;
import com.quynh.dev.repository.DepartRepository;
import com.quynh.dev.repository.StaffRepository;

public interface StaffService {

	void deleteAll();

	void deleteAll(List<Staff> entities);

	void delete(Staff entity);

	void deleteById(String id);

	long count();

	List<Staff> findAllById(List<String> ids);

	Iterable<Staff> findAll();

	boolean existsById(String id);

	Optional<Staff> findById(String id);

	List<Staff> saveAll(List<Staff> entities);

	Staff save(Staff entity);

	List<Depart> findAllDepart();

	List<Role> findAllRole();
}
