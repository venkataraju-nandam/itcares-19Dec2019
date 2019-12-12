package com.org.app.poc.itcares;

import java.net.URL;
import java.util.Optional;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import com.org.app.poc.itcares.bean.CredentialEntity;
import com.org.app.poc.itcares.bean.City;
import com.org.app.poc.itcares.repository.CredentialReposotiry;
import com.org.app.poc.itcares.repository.CityRepository;
import com.org.app.poc.itcares.service.CityService;
import com.org.app.poc.itcares.service.CredentialsService;

import junit.framework.Assert;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HelloServiceTest {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
    @Autowired
    CredentialReposotiry credentialsRepository;
    
    @Autowired
    CredentialsService credService;
	
//	@MockBean
//	City cityMock;
//	
//	@MockBean
//	CityRepository cityMock;
//	
//	@Autowired
//	CityService cityService;
	
	@Test
	public void getHello()throws Exception{
		logger.info("Executing HelloServiceTest -> getHello() " + new URL("http://localhost:" + port + "/").toString());
		ResponseEntity<String> response = 
				 restTemplate.getForEntity(new URL("http://localhost:" + port + "/").toString(), String.class);
		
		logger.info("Executing HelloServiceTest -> getHello() " + new URL("http://localhost:" + port + "/").toString());
		assertEquals("Hello Service", response.getBody());
	}
	

	@Test
	public void credentialsTest() {
	CredentialEntity credentials = new CredentialEntity("Raju","password");
//	when(credentialsRepository.findAll().add(credentials));
//	when(credService.findAll().add(credentials));
	
	CredentialEntity credentialsFromDB = credService.findAll().get(0);
	logger.info("Executing HelloServiceTest -> credentialsTest() " + credentialsFromDB);
	assertEquals(credentials.getUserId(), credentialsFromDB.getUserId());	
//	 Assert.assertEquals(credentials, credentialsFromDB);

	}
	
	private void when(boolean add) {
		// TODO Auto-generated method stub
	}

//	@Test
//	public void getCity() {
////		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });	
////		assertEquals(24, businessImpl.findTheGreatestFromAllData());
//		
////		cityMock.setId((long) 1);
////		cityMock.setName("Australia");
////		cityMock.setPopulation(191919);
////		when(cityMock.findById(1));
//		when(cityService.findById((long) 1).thenReturn(new City("Australia",111)));
//		assertEquals("Australia", cityService.findById((long) 1));
//	}
	


	@Before
	public void before() {
		System.out.println("Before");
	}

	@After
	public void after() {
		System.out.println("After");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	
}
