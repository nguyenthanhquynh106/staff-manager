package com.quynh.dev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quynh.dev.model.Depart;
import com.quynh.dev.model.Role;
import com.quynh.dev.model.Staff;
import com.quynh.dev.repository.DepartRepository;
import com.quynh.dev.repository.RoleRepository;
import com.quynh.dev.repository.StaffRepository;

@Service
public class StaffServiceImpl implements StaffService {

	@Autowired
	StaffRepository staffRepository;

	@Autowired
	DepartRepository departRepository;

	@Autowired
	RoleRepository roleRepository;

	@Override
	public List<Depart> findAllDepart() {
		return (List<Depart>) departRepository.findAll();
	}

	@Override
	public List<Role> findAllRole() {
		return (List<Role>) roleRepository.findAll();
	}

	@Override
	public Staff save(Staff entity) {
		return staffRepository.save(entity);
	}

	@Override
	public List<Staff> saveAll(List<Staff> entities) {
		return (List<Staff>) staffRepository.saveAll(entities);
	}

	@Override
	public Optional<Staff> findById(String id) {
		return staffRepository.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		return staffRepository.existsById(id);
	}

	@Override
	public Iterable<Staff> findAll() {
		return staffRepository.findAll();
	}

	@Override
	public List<Staff> findAllById(List<String> ids) {
		return (List<Staff>) staffRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return staffRepository.count();
	}

	@Override
	public void deleteById(String id) {
		staffRepository.deleteById(id);
	}

	@Override
	public void delete(Staff entity) {
		staffRepository.delete(entity);
	}

	@Override
	public void deleteAll(List<Staff> entities) {
		staffRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		staffRepository.deleteAll();
	}
}
