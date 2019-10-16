package com.mycompany.hibernate_inheritance_demo.model;








import java.util.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("CurrentAccount")
public class CurrentAccount extends Account {
	private double totalwithdraws;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(int acc_number,String acc_hldr_name, String address, String email,double totalwithdraws) {
		super(acc_number,acc_hldr_name,address,email);
		this.totalwithdraws=totalwithdraws;
	}
}