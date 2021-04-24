package com.quynh.dev.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quynh.dev.model.Job;

@Repository
public interface JobRepository extends CrudRepository<Job, String> {

}
