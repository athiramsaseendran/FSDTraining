package com.mycompany.hibernate_inheritance_demo.model;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;
@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "account_type")
@DiscriminatorValue("Account")
public class Account{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int acc_number;
	private String acc_hldr_name;
	private String address;
	private String email;
	

	public Account() {
	}

	public Account(int acc_number,String acc_hldr_name, String address, String email) {
		this.acc_number=acc_number;
		this.acc_hldr_name=acc_hldr_name;
		this.address = address;
		this.email = email;
		
	}
}
