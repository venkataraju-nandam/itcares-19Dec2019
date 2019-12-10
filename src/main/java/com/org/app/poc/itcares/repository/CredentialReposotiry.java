package com.org.app.poc.itcares.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.app.poc.itcares.bean.CredentialEntity;

/**
 * @author Venkata.Nandam
 * By this simple INTERFACE extension, EmployeeRepository inherits several methods for working with 
 * entity persistence, including methods for saving, deleting, and finding Employee entities.
 *
 */
@Repository
public interface CredentialReposotiry extends JpaRepository<CredentialEntity, Long> {

}
