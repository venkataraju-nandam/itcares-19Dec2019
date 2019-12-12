package com.org.app.poc.itcares.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="administrators")
public class CredentialEntity {
	/**
	 * The id property is annotated with @Id so that JPA will recognize it as the object’s ID. Also, 
	 * @GeneratedValue annotation enable its value generated automatically.
	 */
	@Id
	@GeneratedValue
	private long id;
	
	@Column (name = "user_id")
	private String userId;	
	
	@Column(name = "password")
	private String pwd;

	
//	*********************** Added all the given below methods for Junit testing with HelloServiceTest*********
	
	public CredentialEntity() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param uid
	 * @param pwd
	 * Generated this constructor for Junit test
	 */
	public CredentialEntity(String uid, String pwd) {
		// TODO Auto-generated constructor stub
		this.userId =uid;
		this.pwd=pwd;
	}

	@Override
    public String toString() {
        return "AdministrorEntity [id=" + userId + ", firstName=" + pwd + "]";
    }
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}





}
