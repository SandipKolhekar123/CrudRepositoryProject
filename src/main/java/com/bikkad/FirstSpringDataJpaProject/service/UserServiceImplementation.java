package com.bikkad.FirstSpringDataJpaProject.service;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bikkad.FirstSpringDataJpaProject.model.UserModel;
import com.bikkad.FirstSpringDataJpaProject.repository.UserRepositoryI;

@Service
public class UserServiceImplementation implements UserServiceI{
	@Autowired
	private UserRepositoryI userRepositoryI;

	

//	@Override
//	public UserModel saveUser(UserModel model) {
//		UserModel model2 = userRepositoryI.save(model);
//		return model2;
//	}

//	@Override
//	public List<UserModel> saveAllUsers(List<UserModel> list) {
//		List<UserModel> list1 = (List<UserModel>) userRepositoryI.saveAll(list);
//		return list1;
//	}

//	@Override
//	public long countRecords() {
//		long count = userRepositoryI.count();
//		return count;
//	}


//	@Override
//	public Boolean checkRecord(int Id) {
//		boolean existsById = userRepositoryI.existsById(Id);
//		return existsById;
//	}
	
//	@Override
//	public UserModel getRecord(int Id) {
////		Optional<UserModel> findById = userRepositoryI.findById(Id);
//		
//		UserModel findById = userRepositoryI.findById(Id).get();
//		return findById;
//	}
	

//	@Override
//	public void deleteRecordById(int Id) {
//		userRepositoryI.deleteById(Id);
//	}

//	@Override
//	public List<UserModel> getAllUserRecords() {
//		List<UserModel> findAll = (List<UserModel>) userRepositoryI.findAll();
//		return findAll;
//	}

//	@Override
//	public List<UserModel> getMultipleRecordsById(List<Integer> list) {
//			List<UserModel> findAllById = (List<UserModel>) userRepositoryI.findAllById(list);
//			return findAllById;
//	}

//	@Override
//	public void deleteRecordByObject(UserModel user) {
//		userRepositoryI.delete(user);	
//	}
	

//	@Override
//	public void deleteAllRecord() {
//		userRepositoryI.deleteAll();
//	}


	@Override
	public void deleteAllRecordByIds(List<Integer> list) {
		userRepositoryI.deleteAllById(list);
	}
	
}
