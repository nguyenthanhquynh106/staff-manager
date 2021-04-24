package com.quynh.dev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quynh.dev.model.Salary;
import com.quynh.dev.model.Staff;
import com.quynh.dev.repository.SalaryRepository;
import com.quynh.dev.repository.StaffRepository;

@Service
public class SalaryServiceImpl implements SalaryService {

	@Autowired
	SalaryRepository salaryRepository;

	@Autowired
	StaffRepository staffRepository;

	@Override
	public List<Staff> findAllStaff() {
		return (List<Staff>) staffRepository.findAll();
	}

	@Override
	public Salary save(Salary entity) {
		return salaryRepository.save(entity);
	}

	@Override
	public List<Salary> saveAll(List<Salary> entities) {
		return (List<Salary>) salaryRepository.saveAll(entities);
	}

	@Override
	public Optional<Salary> findById(String id) {
		return salaryRepository.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		return salaryRepository.existsById(id);
	}

	@Override
	public Iterable<Salary> findAll() {
		return salaryRepository.findAll();
	}

	@Override
	public List<Salary> findAllById(List<String> ids) {
		return (List<Salary>) salaryRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return salaryRepository.count();
	}

	@Override
	public void deleteById(String id) {
		salaryRepository.deleteById(id);
	}

	@Override
	public void delete(Salary entity) {
		salaryRepository.delete(entity);
	}

	@Override
	public void deleteAll(List<Salary> entities) {
		salaryRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		salaryRepository.deleteAll();
	}

}
