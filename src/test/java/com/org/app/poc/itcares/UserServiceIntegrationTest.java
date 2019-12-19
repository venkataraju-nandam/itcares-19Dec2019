//package com.org.app.poc.itcares;
//
//
//
//import java.util.Optional;
//
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.TestConfiguration;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.org.app.poc.itcares.bean.TestUserBean;
//import com.org.app.poc.itcares.bean.UserEntity;
//import com.org.app.poc.itcares.repository.UserRepository;
//import com.org.app.poc.itcares.service.UserService;
//
//
//
//@RunWith(SpringRunner.class)
//public class UserServiceIntegrationTest {
//
//    @TestConfiguration
//    static class UserServiceTestContextConfiguration {
//  
//        @Bean
//        public UserService userService() {
//            return new UserService();
//        }
//    }
// 
////    @Autowired
//    @InjectMocks
//    private UserService userService;
// 
//    @MockBean
//    private UserRepository userRepository;
//    
//    
//    @Before
//    public void setUp() {
////        UserEntity user = new UserEntity();
////      user.setFirstName(entity.getFirstName());
////      user.setLastName(entity.getLastName());
////      user.setId(entity.getId());
////      user.setUsername(entity.getUsername());
//     
//        Mockito.when(userRepository.findById(user.getId())).thenReturn(Optional.of(user));
//    }
//    
//    @Test
//    public void whenValidId_thenUserShouldBeFound() {
//        UserEntity user = new UserEntity();        
////      UserEntity found = userRepository.findById(user.getId());
//        try {
//        	
//        	UserEntity found = userService.getUserById(1L);
////	        assertThat(found.getFirstName()).isEqualTo(user.getFirstName());
//	        
//        }catch(Exception e) {
//        	 e.printStackTrace();
//         }
//     }
//    
////    @Test
////    public void givenBean_whenToStringReturnsRequiredString_thenCorrect(){
////    	TestUserBean person=new TestUserBean("Barrack");
////        String str=person.toString();
//////        assertThat(person.toString(),str);
////    }
//     
//}
