//package com.org.app.poc.itcares.bean;
//
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//import org.hibernate.annotations.Entity;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity   //not used in my MockitoJunitTest POC, but here required
//public class DatabaseDAO 
//{
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//	@Autowired
//	@Setter @Getter
//	@Column (name = "PERSON_ID")
//    private Long id;
//    
//    public void save(String fileName) {
//        System.out.println("Saved in database");
//    }
//}