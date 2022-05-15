package com.creditcard.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.creditcard.entities.CreditCard;
import com.creditcard.entities.CustomerCreditCard;
import com.creditcard.entities.User;
import com.creditcard.exception.CreditCardNotFoundException;
import com.creditcard.repositories.CreditCardRepository;

@Service
public class CreditCardServiceImpl implements CreditCardService {

	@Autowired
	CreditCardRepository creditCardRepo;

	@Override
	public List<CreditCard> getCreditCardList() {
		// TODO Auto-generated method stub
		return creditCardRepo.findAll();
	}

	public CreditCard addCreditCard(CreditCard creditcard) {
		// TODO Auto-generated method stub
		return creditCardRepo.save(creditcard);
	}



	@Override
	public CreditCard getCreditCardById(Integer creditcardId) {
		// TODO Auto-generated method stub
		return creditCardRepo.getById(creditcardId);
	}

	@Override
	public CreditCard getCreditCardByType(String cardType) {

		return creditCardRepo.getByType(cardType);
	}

	@Override
	public void deletecreditcard(Integer cardId) {
		Optional<CreditCard> optionalCreditCard = creditCardRepo.findById(cardId);

		if (!optionalCreditCard.isPresent()) {
			throw new CreditCardNotFoundException("CreditCard not exising with id: " + cardId);
		}

		CreditCard creditcard = optionalCreditCard.get();

		creditCardRepo.delete(creditcard);

	}
	



}

