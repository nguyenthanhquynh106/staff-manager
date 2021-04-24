package com.quynh.dev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quynh.dev.model.Depart;
import com.quynh.dev.model.Job;
import com.quynh.dev.model.Staff;
import com.quynh.dev.repository.DepartRepository;
import com.quynh.dev.repository.JobRepository;

@Service
public class JobServiceImpl implements JobService {
	
	@Autowired
	JobRepository jobRepository;

	@Autowired
	DepartRepository departRepository;
	
	@Override
	public List<Depart> findAllDepart() {
		return (List<Depart>) departRepository.findAll();
	}

	@Override
	public Job save(Job entity) {
		return jobRepository.save(entity);
	}

	@Override
	public List<Job> saveAll(List<Job> entities) {
		return (List<Job>) jobRepository.saveAll(entities);
	}

	@Override
	public Optional<Job> findById(String id) {
		return jobRepository.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		return jobRepository.existsById(id);
	}

	@Override
	public Iterable<Job> findAll() {
		return jobRepository.findAll();
	}

	@Override
	public List<Job> findAllById(List<String> ids) {
		return (List<Job>) jobRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return jobRepository.count();
	}

	@Override
	public void deleteById(String id) {
		jobRepository.deleteById(id);
	}

	@Override
	public void delete(Job entity) {
		jobRepository.delete(entity);
	}

	@Override
	public void deleteAll(List<Job> entities) {
		jobRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		jobRepository.deleteAll();
	}
}
