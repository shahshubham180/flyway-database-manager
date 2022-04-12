package com.springboot.tutorials.flywaydatabasemanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long custId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private Long age;
	
	private Long bookId;
	
	private String bookName;
	
	private String plantype;

}
