package com.quynh.dev.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quynh.dev.model.Admin;
import com.quynh.dev.model.Staff;

@Repository
public interface StaffRepository extends CrudRepository<Staff, String> {

}
