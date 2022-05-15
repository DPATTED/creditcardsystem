package com.creditcard.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.creditcard.entities.User;
import com.creditcard.exception.NotFoundException;
import com.creditcard.exception.UserNotFoundException;
import com.creditcard.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	@Override
	public User addUser(User user) {
	    user.setRole("user");
		return userRepo.save(user);
	}

	
	
	@Override
	public User updateuser(User user1) {
		return userRepo.save(user1);
	}
	

	@Override
	public User getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return userRepo.getById(userId);
	}
	
	
	@Override
	public boolean deleteUser(Integer userId) {
		userRepo.deleteById(userId);

		User u1 = userRepo.getById(userId);
		if (u1 == null) {
			return true;
		}
		return false;
	}

//	@Override
//	public User getUser() {
//		// TODO Auto-generated method stub
//		return (User) userRepo.findAll();
//	}


//
//	@Override
//	public List<User> getAllUsers() {
//		// TODO Auto-generated method stub
//		return userRepo.findAll();
//	}



	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}



	@Override
	public User validateUser(String userName, String password) throws UserNotFoundException {



	if (!userRepo.existsByuserName(userName)) {
	throw new UserNotFoundException("User Not Existing");
	}



	return userRepo.validateUserCredentials(userName, password);
	}



	@Override
	public boolean validateUserPhnumber(Long pnumber, String userName) throws NotFoundException {
		if (!userRepo.existsByuserName(userName)) {
			throw new UserNotFoundException("User Not Existing");
			}
		Optional<User> result=userRepo.validateUserMobile(pnumber, userName);	
		if(!result.isPresent()) {
			throw new NotFoundException("mobile validation failed");
			
			}
		
		return true;
	}

//	---------------------------------------------------
//	@Override
//	public boolean validateUserPhnumber(Long pnumber, int userId) throws NotFoundException {
//	Optional<User> result=userRepo.validateUserMobile(pnumber, userId);
//	if(!result.isPresent()) {
//	throw new NotFoundException("mobile validation failed");
//
//	}
//	return true;
//	}


}