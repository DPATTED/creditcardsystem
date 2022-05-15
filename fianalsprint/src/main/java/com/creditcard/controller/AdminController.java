//package com.creditcard.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.creditcard.entities.Admin;
//import com.creditcard.service.AdminService;
//
//@RestController
//@RequestMapping("/api/admin")
//public class AdminController {
//	@Autowired
//	AdminService adminService;
//	 @PostMapping("/addadmin")
//	    public Admin addAdmin(@RequestBody Admin admin){
//	        return adminService.addAdmin(admin);
//	    }
//	 
//	 
//	 @GetMapping("/getadmin/{adminId}")
//	
//	    public Admin getAdmin(@PathVariable("adminId") int adminId){
//	        return adminService.getAdmin(adminId);
//	    }
//	 @PostMapping("/login")
//	 public Admin validatelogin (@RequestBody Admin admin) {
//		 return adminService.checkLogin(admin.getUserName(), admin.getPassword());
//	 }
//	 
//
//}
