package com.bikkad.FirstSpringDataJpaProject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bikkad.FirstSpringDataJpaProject.model.UserModel;

@Repository
public interface UserRepositoryI extends CrudRepository<UserModel, Integer>{
	
}
