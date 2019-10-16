package com.mycompany.hibernate_inheritance_table_demo.table_per_subclass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity  
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name="CurrentAccount")   
@PrimaryKeyJoinColumn(name = "id")

public class CurrentAccount extends Account{
 
 @Column(name="totalwithdraws")
 private double totalwithdraws;
 
 

}