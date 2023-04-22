package com.bikkad.FirstSpringDataJpaProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bikkad.FirstSpringDataJpaProject.model.UserModel;
import com.bikkad.FirstSpringDataJpaProject.repository.UserRepositoryI;
import com.bikkad.FirstSpringDataJpaProject.service.UserServiceI;
import com.bikkad.FirstSpringDataJpaProject.service.UserServiceImplementation;

@RestController
public class UserController {
	@Autowired
	private UserServiceI userServiceI;
	
//	public UserModel saveUser(UserModel model) {
//		UserModel model2 = userServiceI.saveUser(model);
//		return model2;
//	}
	
//	public List<UserModel> saveAllUsers(List<UserModel> list) {
//		List<UserModel> list1 = (List<UserModel>) userServiceI.saveAllUsers(list);
//		return list1;
//	}
	
//	public long countRecords() {
//		long count = userServiceI.countRecords();
//		return count;
//	}
	
//	public Boolean checkRecord(int Id) {
//		boolean existsById = userServiceI.checkRecord(Id);
//		return existsById;
//	}
	
//	public UserModel getRecord(int Id) {
//		UserModel findById = userServiceI.getRecord(Id);
//		return findById;
//	}
	
//	public void deleteRecordById(int Id) {
//		userServiceI.deleteRecordById(Id);
//	}
	
//	public List<UserModel> getAllUserRecords() {
//		List<UserModel> findAll = (List<UserModel>) userServiceI.getAllUserRecords();
//		return findAll;
//	}
	
//	public List<UserModel> getMultipleRecordsById(List<Integer> list) {
//		List<UserModel> findAllById = (List<UserModel>) userServiceI.getMultipleRecordsById(list);
//		return findAllById;
//	}
	
//	public void deleteRecordByObject(UserModel user) {
//		userServiceI.deleteRecordByObject(user);	
//	}
	
//	public void deleteAllRecord() {
//		userServiceI.deleteAllRecord();
//		
//	}
	
	public void deleteAllRecordByIds(List<Integer> list) {
		userServiceI.deleteAllRecordByIds(list);
	}
}
