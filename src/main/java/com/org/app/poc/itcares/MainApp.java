package com.org.app.poc.itcares;


import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;

import com.org.app.poc.itcares.bean.CredentialEntity;
import com.org.app.poc.itcares.repository.CredentialReposotiry;


 
/** 
 * @author Venkata.Nandam
 * https://spring.io/guides/gs/rest-service/
 * 
 * Make the application executable
Although it is possible to package this service as a traditional WAR file for deployment 
to an external application server, 
the simpler approach demonstrated below creates a standalone application. 
You package everything in a single, executable JAR file, 
driven by a good old Java main() method. Along the way, 
you use Spring’s support for embedding the Tomcat servlet container as the HTTP runtime, 
instead of deploying to an external instance.

You need component scan for all your packages and entity scan for all your entities
 *
@EntityScan(basePackageClasses = {"com.org.app.poc.itcares.bean"})
@Import({com.org.app.poc.itcares.bean.AdministratorEntity.class}) 
 @EntityScan({"com.org.app.poc.itcares.bean"})
 
 
 @ComponentScan ({"com.org.app.poc.itcares.Repository"})
@EntityScan(basePackageClasses = {AdministratorEntity.class})
@Import({com.org.app.poc.itcares.bean.AdministratorEntity.class}) 
 
 */


//@EnableZuulProxy
@SpringBootApplication
@ComponentScan
@EntityScan
public class MainApp implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    CredentialReposotiry repository;
    
    static ApplicationContext ctx;

    public static void main(String[] args) {
        ctx = SpringApplication.run(MainApp.class, args);
        System.out.println("********** SpringBoot Main App *****  Started  ***** ");

    }
    
    
    public void run(String... args) throws Exception 
    {       
    		logger.info("********** SpringBoot Main App ***** RUN  ***** ");
//        Optional<AdministratorEntity> adminEntity = repository.findById(2L);
    		logger.info(" -********** SpringBoot Main App *****  Repository Count  = " + repository.count());
    	 
    		List<CredentialEntity> adminEntities = repository.findAll();
        
        	logger.info("********** SpringBoot Main App *****   Entities Accessed *****");
 
        	if (adminEntities !=null && !adminEntities.isEmpty()) {
        			logger.info(" ********** SpringBoot Main App *****    Entity List Retriving -  adminEntities.get(0) -> "+ adminEntities.get(0));
        	}
        	
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println("********** SpringBoot Main App *****  BEANS ->  ***** "+ beanName);
//            }
    }
    
    
    /**
     * @return
     * Adding this method Cucumber Integration test	
     */
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    
}

