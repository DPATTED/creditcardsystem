package com.creditcard.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.creditcard.entities.Transaction;
import com.creditcard.repositories.TransactionRepository;
@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionRepository transactionRepo;
	@Transactional
	@Override
	public Transaction addTransaction(Transaction transaction) {
		// TODO Auto-generated method stub
		return transactionRepo.save(transaction);
	}

	@Override
	public Transaction getTransactionById(Integer transactionId) {
		// TODO Auto-generated method stub
		return transactionRepo.getById(transactionId);
	}

	@Override
	public List<Transaction> getAllTransactions() {
		// TODO Auto-generated method stub
		return transactionRepo.findAll();
	}

	@Override
	public List<Transaction> getAllTransactionByCid(Long customercreditcardNumber) {
		// TODO Auto-generated method stub
		return transactionRepo.getTransactionByCustomer(customercreditcardNumber);
	}

	@Override
	public Transaction updatetransaction(Transaction transaction1) {
		// TODO Auto-generated method stub
		return transactionRepo.save(transaction1);
	}

	@Override
	public boolean deleteTransaction(Integer transactionId) {
		// TODO Auto-generated method stub
		transactionRepo.deleteById(transactionId);
		Transaction u1 = transactionRepo.getById(transactionId);
		if (u1 == null) {
		return true;
		}
		return false;
	}
	

}
