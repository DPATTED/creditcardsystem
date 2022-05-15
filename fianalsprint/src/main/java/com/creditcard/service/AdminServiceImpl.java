//package com.creditcard.service;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import com.creditcard.entities.Admin;
//import com.creditcard.repositories.AdminRepository;
//@Service
//public class AdminServiceImpl implements AdminService {
//
//	@Autowired
//	AdminRepository adminRepo;
//	@Transactional
//	@Override
//	public Admin addAdmin(Admin admin) {
//		return adminRepo.save(admin);
//	}
//
//	@Override
//	public Admin checkLogin(String userName, String password) {
//		return adminRepo.validateLogin(userName, password);
//	}
//
//	@Override
//	public Admin getAdmin(int Id) {
//		// TODO Auto-generated method stub
//		return adminRepo.getById(Id);
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
////	@Override
////	public ResponseEntity<Admin> addAdmin(Admin admin) {
////		return adminRepo.save(admin);
////	}
////
////	@Override
////	public Admin getAdmin(int Id) {
////		return adminRepo.getById(Id);
////	}
////
////	@Override
////	public Admin checkLogin(String userName, String password) {
////		return adminRepo.validateLogin(userName, password);
////	}
//
//}
