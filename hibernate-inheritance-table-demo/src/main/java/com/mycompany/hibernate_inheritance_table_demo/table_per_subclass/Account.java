package com.mycompany.hibernate_inheritance_table_demo.table_per_subclass;
import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "Account")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    
	private int id;
	@Column(name = "acc_number")
	private int acc_number;

	@Column(name = "acc_hldr_name")
	private String acc_hldr_name;

	@Column(name = "address")
	private String address;
	
	@Column(name = "email")
	private String email;
	
	public Account() {

	}

}




