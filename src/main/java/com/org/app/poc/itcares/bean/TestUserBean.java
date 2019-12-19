package com.org.app.poc.itcares.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name = "fw_user1")
@RequiredArgsConstructor
public class TestUserBean {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Autowired
	@Setter @Getter
	@Column (name = "PERSON_ID")
    private Long id;
    

	@Autowired
	@Setter @Getter
	@Column (name = "FIRST_NAME")
	private String firstName;
	
	public TestUserBean(String fName) {
		this.firstName= fName;
	}


}
