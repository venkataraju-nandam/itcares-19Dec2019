package com.org.app.poc.itcares.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name = "person")
@RequiredArgsConstructor
public class Employee {
 
  

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

	@Setter @Getter
    private String name;
 

	  public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Employee(String name) {
			this.name = name;
		}
	    // standard getters and setters, constructors
}