package com.org.app.poc.itcares.service;

import java.util.List;

import com.org.app.poc.itcares.bean.CredentialEntity;

public interface ICredentialService {
	
	List<CredentialEntity> findAll();

}
