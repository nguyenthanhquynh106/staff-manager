package com.quynh.dev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quynh.dev.model.Depart;
import com.quynh.dev.repository.DepartRepository;

@Service
public class DepartServiceImpl implements DepartService {

	@Autowired
	DepartRepository departRepository;

	@Override
	public Depart save(Depart entity) {
		return departRepository.save(entity);
	}

	@Override
	public List<Depart> saveAll(List<Depart> entities) {
		return (List<Depart>) departRepository.saveAll(entities);
	}

	@Override
	public Optional<Depart> findById(String id) {
		return departRepository.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		return departRepository.existsById(id);
	}

	@Override
	public List<Depart> findAll() {
		return (List<Depart>) departRepository.findAll();
	}

	@Override
	public List<Depart> findAllById(Iterable<String> ids) {
		return (List<Depart>) departRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return departRepository.count();
	}

	@Override
	public void deleteById(String id) {
		departRepository.deleteById(id);
	}

	@Override
	public void delete(Depart entity) {
		departRepository.delete(entity);
	}

	@Override
	public void deleteAll(List<Depart> entities) {
		departRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		departRepository.deleteAll();
	}

}
