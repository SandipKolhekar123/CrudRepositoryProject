package com.bikkad.FirstSpringDataJpaProject;

import java.lang.ModuleLayer.Controller;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bikkad.FirstSpringDataJpaProject.controller.UserController;
import com.bikkad.FirstSpringDataJpaProject.model.UserModel;

@SpringBootApplication
public class FirstSpringDataJpaProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstSpringDataJpaProjectApplication.class, args);
		
//		UserModel user = new UserModel();
//			user.setUserId(1);
//			user.setUserName("Dael Carnage");
//			user.setUserAddress("New York");
//			user.setUserAge(45);
//			user.setUserPhone("9503669988");
		
//		save()- for single record
			
//		UserController controller = context.getBean(UserController.class);
//			controller.saveUser(user);
			
//			saveAll()- for multiple records
			
//		UserModel user = new UserModel();
//		user.setUserId(2);
//		user.setUserName("Jack Dorsey");
//		user.setUserAddress("Menipollies");
//		user.setUserAge(49);
//		user.setUserPhone("8956457865");
//		
//		UserModel user1 = new UserModel();
//		user1.setUserId(3);
//		user1.setUserName("Lucy McDonald");
//		user1.setUserAddress("New York");
//		user1.setUserAge(45);
//		user1.setUserPhone("9878124565");
//		
//		UserModel user2 = new UserModel();
//		user2.setUserId(4);
//		user2.setUserName("Mark Zuckerberg");
//		user2.setUserAddress("Minesonota");
//		user2.setUserAge(56);
//		user2.setUserPhone("9654789632");
//			
//		List<UserModel> list = new ArrayList();
//			list.add(user);
//			list.add(user1);
//			list.add(user2);
//		UserController controller = context.getBean(UserController.class);
//		controller.saveAllUsers(list);
		
//		count()-long- return no of records
		
//		UserController controller = context.getBean(UserController.class);
//		long countRecords = controller.countRecords();
//		System.out.println(countRecords);
		
//		existsById(Id)-
		
//		UserController controller = context.getBean(UserController.class);
//			Boolean checkRecord = controller.checkRecord(6);
//			System.out.println(checkRecord);
		
//		findById(Id)-
		
//		UserController controller = context.getBean(UserController.class);
//			UserModel record = controller.getRecord(2);
//			System.out.println(record);
		
//		findAll()-
//		
//		UserController controller = context.getBean(UserController.class);
//		List<UserModel> allUserRecords = controller.getAllUserRecords();
//		for(UserModel u: allUserRecords) {
//			System.out.println(u);
//		}
		
//		findAllById()-
		
//		List<Integer> asList = Arrays.asList(2,1,4,3);
//		
//		UserController controller = context.getBean(UserController.class);
//			List<UserModel> multipleRecordsById = controller.getMultipleRecordsById(asList);
//		for(UserModel u: multipleRecordsById) {
//			System.out.println(u);
//		}
		
//		deleteById(Id)-
		
//		UserController controller = context.getBean(UserController.class);
//			controller.deleteRecordById(3);
		
//		delete(Object Entity)-
		
//		UserModel user = new UserModel();
//			user.setUserId(1);
//		UserController controller = context.getBean(UserController.class);
//				controller.deleteRecordByObject(user);
		
//		deleteAll()-
		
//		UserController controller = context.getBean(UserController.class);
//		controller.deleteAllRecord();
		
//		deleteAllById()-
//		
		 List<Integer> asList = Arrays.asList(7,5);
		
		UserController controller = context.getBean(UserController.class);
			controller.deleteAllRecordByIds(asList);
	}
}
