package com.quynh.dev.repository;

import org.springframework.data.repository.CrudRepository;

import com.quynh.dev.model.Admin;

public interface AdminRepository extends CrudRepository<Admin, String> {

}
