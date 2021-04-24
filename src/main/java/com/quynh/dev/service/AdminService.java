package com.quynh.dev.service;

import java.util.List;
import java.util.Optional;

import com.quynh.dev.model.Admin;

public interface AdminService {

	boolean checkLogin(String username, String password);

	void deleteAll();

	void deleteAll(List<Admin> entities);

	void delete(Admin entity);

	void deleteById(String id);

	long count();

	List<Admin> findAllById(List<String> ids);

	List<Admin> findAll();

	boolean existsById(String id);

	Optional<Admin> findById(String id);

	List<Admin> saveAll(List<Admin> entities);

	Admin save(Admin entity);

}
