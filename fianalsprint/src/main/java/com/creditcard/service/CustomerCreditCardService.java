package com.creditcard.service;


import java.util.List;

import com.creditcard.entities.CustomerCreditCard;
import com.creditcard.entities.User;

public interface CustomerCreditCardService {

	 public CustomerCreditCard addCustomerCreditCard(CustomerCreditCard customercreditcard);
	
//	public User addUser(User user);

//	CustomerCreditCard getCustomerCreditCardByNumber(Integer customercreditcardNumber);


	List<CustomerCreditCard> getCustomerCreditCard();



}
