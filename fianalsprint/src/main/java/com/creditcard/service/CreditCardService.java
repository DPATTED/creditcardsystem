package com.creditcard.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.creditcard.entities.CreditCard;
import com.creditcard.entities.CustomerCreditCard;
import com.creditcard.entities.User;

public interface CreditCardService {

	List<CreditCard> getCreditCardList();

	public CreditCard addCreditCard(CreditCard creditcard);

	CreditCard getCreditCardById(Integer creditcardId);

	CreditCard getCreditCardByType(String cardType);

	void deletecreditcard(Integer cardId);

}
