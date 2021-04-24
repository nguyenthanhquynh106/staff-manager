package com.quynh.dev.service;

import java.util.List;
import java.util.Optional;

import com.quynh.dev.model.Depart;

public interface DepartService {

	void deleteAll();

	void deleteAll(List<Depart> entities);

	void delete(Depart entity);

	void deleteById(String id);

	long count();

	List<Depart> findAllById(Iterable<String> ids);

	List<Depart> findAll();

	boolean existsById(String id);

	Optional<Depart> findById(String id);

	List<Depart> saveAll(List<Depart> entities);

	Depart save(Depart entity);
}
