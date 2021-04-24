package com.quynh.dev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quynh.dev.model.Admin;
import com.quynh.dev.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository;

	@Override
	public Admin save(Admin entity) {
		return adminRepository.save(entity);
	}

	@Override
	public List<Admin> saveAll(List<Admin> entities) {
		return (List<Admin>) adminRepository.saveAll(entities);
	}

	@Override
	public Optional<Admin> findById(String id) {
		return adminRepository.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		return adminRepository.existsById(id);
	}

	@Override
	public List<Admin> findAll() {
		return (List<Admin>) adminRepository.findAll();
	}

	@Override
	public List<Admin> findAllById(List<String> ids) {
		return (List<Admin>) adminRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return adminRepository.count();
	}

	@Override
	public void deleteById(String id) {
		adminRepository.deleteById(id);
	}

	@Override
	public void delete(Admin entity) {
		adminRepository.delete(entity);
	}

	@Override
	public void deleteAll(List<Admin> entities) {
		adminRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		adminRepository.deleteAll();
	}

	@Override
	public boolean checkLogin(String username, String password) {
		Optional<Admin> optionalAdmin = findById(username);
		if (optionalAdmin.isPresent() && optionalAdmin.get().getPassword().equals(password)) {
			return true;
		}
		return false;
	}

}
