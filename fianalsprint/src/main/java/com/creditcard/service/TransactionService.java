package com.creditcard.service;

import java.util.List;
import java.util.function.IntPredicate;

import com.creditcard.entities.Transaction;
import com.creditcard.entities.User;

public interface TransactionService {

	Transaction addTransaction(Transaction transaction);

	Transaction getTransactionById(Integer transactionId);

	List<Transaction> getAllTransactions();
//	
//	List<Transaction> getAllTransactionByCid(Integer creditcardnumber);
//
//	List<User> getAllTransaction();

	List<Transaction> getAllTransactionByCid(Long customercreditcardNumber);
//
//	List<Transaction> getAllTransactionByUid(Integer userId);

	Transaction updatetransaction(Transaction transaction1);

	boolean deleteTransaction(Integer transactionId);

	

//	Transaction updatetransaction(Transaction transaction1);

	

//	Transaction updateTransaction(Transaction transaction);

}
