package com.quynh.dev.service;

import java.util.List;
import java.util.Optional;

import com.quynh.dev.model.Depart;
import com.quynh.dev.model.Job;

public interface JobService {

	void deleteAll();

	void deleteAll(List<Job> entities);

	void delete(Job entity);

	void deleteById(String id);

	long count();

	List<Job> findAllById(List<String> ids);

	Iterable<Job> findAll();

	boolean existsById(String id);

	Optional<Job> findById(String id);

	List<Job> saveAll(List<Job> entities);

	Job save(Job entity);

	List<Depart> findAllDepart();

}
