package com.quynh.dev.service;

import java.util.List;
import java.util.Optional;

import com.quynh.dev.model.Role;

public interface RoleService {

	void deleteAll();

	void deleteAll(List<Role> entities);

	void delete(Role entity);

	void deleteById(String id);

	long count();

	List<Role> findAllById(Iterable<String> ids);

	List<Role> findAll();

	boolean existsById(String id);

	Optional<Role> findById(String id);

	List<Role> saveAll(List<Role> entities);

	Role save(Role entity);

}
