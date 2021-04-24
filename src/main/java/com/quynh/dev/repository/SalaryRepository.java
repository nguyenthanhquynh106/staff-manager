package com.quynh.dev.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quynh.dev.model.Salary;
import com.quynh.dev.model.Staff;

@Repository
public interface SalaryRepository extends CrudRepository<Salary, String> {

}
