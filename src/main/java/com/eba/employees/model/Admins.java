package com.eba.employees.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admins")
public class Admins {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	public Admins() {
		
	}
}
