package com.creditcard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.creditcard.entities.CreditCard;
import com.creditcard.entities.CustomerCreditCard;
import com.creditcard.entities.User;
import com.creditcard.service.CreditCardService;
import com.creditcard.service.CustomerCreditCardService;

@RestController
@RequestMapping("/api/customer")
@CrossOrigin(origins = "http://localhost:3000")
public class CustomerCreditcardController {
	@Autowired
	CustomerCreditCardService customercreditcardService;
	
	 @PostMapping("/addcard")
	    public CustomerCreditCard  addCustomerCreditCard (@RequestBody CustomerCreditCard  customercreditcard ){
	        return customercreditcardService.addCustomerCreditCard (customercreditcard );
	    }
	
	
	
	
//	
//	 @PostMapping("/addcard")
//	    public CustomerCreditCard addCustomerCreditcard(@RequestBody CustomerCreditCard customercreditcard){
//	        return customercreditcardService.addCustomerCreditCard(customercreditcard);
//	    }
//	 
	 @GetMapping("/getallcards")
	    public List<CustomerCreditCard> getCreditcard(){
	        return customercreditcardService.getCustomerCreditCard();
	    }
}
	 
	 
	 
	 
	 
	 
	 
	 
//	 @GetMapping("/getallcards/{number}")
//	 public ResponseEntity<List<CustomerCreditCard>> getAllCustomerCreditCard(
//	 @PathVariable("number")Long customercreditcardNumber){
//	 List<CustomerCreditCard> customercreditcard= CustomerCreditCardService.getCustomerCreditCardByNumber(customercreditcardNumber);
//	 if(customercreditcard.isEmpty()) {
//	 return new ResponseEntity("Sorry! customercreditcard not found!",
//	 HttpStatus.NOT_FOUND);
//	 }
//
//	 return new ResponseEntity<List<CustomerCreditCard>>(customercreditcard, HttpStatus.OK);
//	 }
	 
	 
	 
	 
	 
	 
//	@GetMapping("/getcard/{number}")
//	public ResponseEntity<CustomerCreditCard> getCustomerCreditcard(
//			@PathVariable("number")Integer customercreditcardNumber){
//		CustomerCreditCard customercreditcard= customercreditcardService.getCustomerCreditCardByNumber(customercreditcardNumber);
//		if(customercreditcard==null) {
//			return new ResponseEntity("Sorry! CustomerCreditcard not found!", 
//					HttpStatus.NOT_FOUND);
//		}
//		
//		return new ResponseEntity<CustomerCreditCard>(customercreditcard, HttpStatus.OK);
//	}





//**********************************************************

//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.creditcard.entities.CreditCard;
//import com.creditcard.entities.CustomerCreditCard;
//import com.creditcard.service.CreditCardService;
//import com.creditcard.service.CustomerCreditCardService;
//
//@RestController
//@RequestMapping("/api/customer")
//public class CustomerCreditcardController {
//	@Autowired
//	CustomerCreditCardService customercreditcardService;
//	
//	 @PostMapping("/addcard")
//	    public CustomerCreditCard addCustomerCreditcard(@RequestBody CustomerCreditCard customercreditcard){
//	        return customercreditcardService.addCustomerCreditCard(customercreditcard);
//	    }
//	 
//	 @GetMapping("/getallcards")
//	    public List<CustomerCreditCard> getCreditcard(){
//	        return customercreditcardService.getCustomerCreditCard();
//	    }
////	@GetMapping("/getcard/{number}")
////	public ResponseEntity<CustomerCreditCard> getCustomerCreditcard(
////			@PathVariable("number")Integer customercreditcardNumber){
////		CustomerCreditCard customercreditcard= customercreditcardService.getCustomerCreditCardByNumber(customercreditcardNumber);
////		if(customercreditcard==null) {
////			return new ResponseEntity("Sorry! CustomerCreditcard not found!", 
////					HttpStatus.NOT_FOUND);
////		}
////		
////		return new ResponseEntity<CustomerCreditCard>(customercreditcard, HttpStatus.OK);
////	}
////	
//	

