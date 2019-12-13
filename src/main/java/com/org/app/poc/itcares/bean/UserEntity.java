package com.org.app.poc.itcares.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "fw_user1")
public class UserEntity {
	
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
	
	@Autowired
	@Setter @Getter
	@Column (name = "MIDDLE_NAME")
    private String middleName;
	
	@Autowired
	@Setter @Getter
	@Column (name = "LAST_NAME")
    private String lastName;

	@Autowired
	@Setter @Getter
	@Column (name = "USER_NAME")
    private String username;
	
	@Override
    public String toString() {
        return "UserEntity [person id=" + id + ", firstName=" + firstName + "]";
    }


	
}
