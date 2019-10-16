package com.mycompany.hibernate_inheritance_demo.model;

import java.util.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("SavingsAccount")
public class SavingsAccount extends Account {
	private double balance;
	private  double annualInterestrate;
	
	private double totaldeposits; 
	
	
	

	public SavingsAccount() {
	}

	public SavingsAccount(int acc_number,String acc_hldr_name, String address, String email,double balance,double annualInterestrate,double totaldeposits) {
		super(acc_number,acc_hldr_name,address,email);
		
		this.balance = balance;
		this.annualInterestrate=annualInterestrate;
		
		this.totaldeposits=totaldeposits;
	}
}
