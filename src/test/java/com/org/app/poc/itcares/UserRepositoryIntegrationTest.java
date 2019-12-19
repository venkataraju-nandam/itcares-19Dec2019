//package com.org.app.poc.itcares;
//
//import java.util.Optional;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.org.app.poc.itcares.bean.UserEntity;
//import com.org.app.poc.itcares.repository.UserRepository;
//import com.org.app.poc.itcares.service.UserService;
//
//@RunWith(SpringRunner.class)
//@DataJpaTest
//public class UserRepositoryIntegrationTest {
//	
//	  @Autowired
//	   private UserService userService;
//	 
//	    @Autowired
//	    private UserRepository userRepository;
//	
//	@Test
//	public void whenFindById_thenReturnUser() {
//		
////		Optional<UserEntity> user = repository.findById(id);
//		
//	    // given
//		UserEntity newUser = new UserEntity();
////	    newUser.setFirstName("Raj");
////	    newUser.setLastName("N");
////	    newUser.setId(666999L);
////	    newUser.setUsername("Raj_N");
//	    userService.save(newUser);
////	    userService.persist(newUser);
////	    userService.flush();
//	 
////	    // when
//	    Optional<UserEntity> found = userRepository.findById(newUser.getId());
////	 
////	    // then
//	    assertThat(found.getFirstName()).isEqualTo(newUser.getFirstName());
//	}
//
//}
