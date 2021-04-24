package com.quynh.dev.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quynh.dev.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, String> {

}
