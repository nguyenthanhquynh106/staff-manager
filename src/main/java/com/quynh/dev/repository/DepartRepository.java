package com.quynh.dev.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quynh.dev.model.Depart;

@Repository
public interface DepartRepository extends CrudRepository<Depart, String> {

}
