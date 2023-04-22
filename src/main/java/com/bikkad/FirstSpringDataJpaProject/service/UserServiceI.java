package com.bikkad.FirstSpringDataJpaProject.service;

import java.util.List;

import org.apache.catalina.User;

import com.bikkad.FirstSpringDataJpaProject.model.UserModel;

public interface UserServiceI {
	
//	public UserModel saveUser(UserModel model);
	
//	public List<UserModel> saveAllUsers(List<UserModel> list);
	
//	public long countRecords();
	
//	public Boolean checkRecord(int Id);
	
//	public UserModel getRecord(int Id);
	
//	public void deleteRecordById(int Id);
	
//	public List<UserModel> getAllUserRecords();
	
//	public List<UserModel> getMultipleRecordsById(List<Integer> list);
	
//	public void deleteRecordByObject(UserModel user);

//	public void deleteAllRecord();
	
	public void deleteAllRecordByIds(List<Integer> list);
}
