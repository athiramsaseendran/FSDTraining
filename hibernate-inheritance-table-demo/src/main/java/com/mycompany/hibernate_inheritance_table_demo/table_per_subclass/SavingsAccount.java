package com.mycompany.hibernate_inheritance_table_demo.table_per_subclass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "SavingsAccount")
@PrimaryKeyJoinColumn(name ="id")
@Data
@EqualsAndHashCode(callSuper = false)
public class SavingsAccount extends Account {

	@Column(name = "balance")
	private double balance;

	@Column(name = "annualInterestrate")
	private double annualInterestrate;
	
	@Column(name = "totaldeposits")
	private double totaldeposits;
	
	
}
