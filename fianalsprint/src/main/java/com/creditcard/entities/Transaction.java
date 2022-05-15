package com.creditcard.entities;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="transaction")
public class Transaction {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	

@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRANSACTION_SEQ") 
@SequenceGenerator(sequenceName = "transactionid_seq", allocationSize = 1, name = "TRANSACTION_SEQ")
	private int transactionId;
//	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "DD-MM-YYYY")
//	@Temporal(TemporalType.TIMESTAMP)
	private LocalDate transactiondate;
	private String status;
	private int amount;

//	@JsonIgnore
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="cardNumber")
	private CustomerCreditCard customerCreditCard;   //foreign Key


	public int getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}


	public LocalDate getTransactiondate() {
		return transactiondate;
	}


	public void setTransactiondate(LocalDate transactiondate) {
		this.transactiondate = transactiondate;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public CustomerCreditCard getCustomerCreditCard() {
		return customerCreditCard;
	}


	public void setCustomerCreditCard(CustomerCreditCard customerCreditCard) {
		this.customerCreditCard = customerCreditCard;
	}
	
	
	


	

}
