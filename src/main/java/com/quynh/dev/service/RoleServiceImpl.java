package com.quynh.dev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quynh.dev.model.Role;
import com.quynh.dev.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleRepository;

	@Override
	public Role save(Role entity) {
		return roleRepository.save(entity);
	}

	@Override
	public List<Role> saveAll(List<Role> entities) {
		return (List<Role>) roleRepository.saveAll(entities);
	}

	@Override
	public Optional<Role> findById(String id) {
		return roleRepository.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		return roleRepository.existsById(id);
	}

	@Override
	public List<Role> findAll() {
		return (List<Role>) roleRepository.findAll();
	}

	@Override
	public List<Role> findAllById(Iterable<String> ids) {
		return (List<Role>) roleRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return roleRepository.count();
	}

	@Override
	public void deleteById(String id) {
		roleRepository.deleteById(id);
	}

	@Override
	public void delete(Role entity) {
		roleRepository.delete(entity);
	}

	@Override
	public void deleteAll(List<Role> entities) {
		roleRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		roleRepository.deleteAll();
	}

}
