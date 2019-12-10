package com.org.app.poc.itcares.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.app.poc.itcares.bean.CredentialEntity;
import com.org.app.poc.itcares.repository.CredentialReposotiry;

@Service
public class CredentialsService implements ICredentialService {
	
	@Autowired
	CredentialReposotiry adminRepository;
	
	public List<CredentialEntity> findAll() {
		return adminRepository.findAll();
	}

}
