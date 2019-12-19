//package com.org.app.poc.itcares;
//
//import static org.mockito.Mockito.mock;
//
//import java.util.Optional;
//
//import static org.mockito.Mockito.*;
//
//import org.junit.Before;
//
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.MockitoJUnitRunner;
////import org.springframework.boot.test.mock.mockito.MockBean;
////import org.springframework.test.util.ReflectionTestUtils;
//
//import com.org.app.poc.itcares.bean.UserEntity;
//import com.org.app.poc.itcares.repository.UserRepository;
//import com.org.app.poc.itcares.service.UserService;
//
//import junit.framework.Assert;
//import junit.runner.Version;
//import lombok.Data;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.assertThat;
//
//
////import org.junit.jupiter.api.Test;
//import org.junit.Test;
//
//@RunWith(MockitoJUnitRunner.class)
//public class MockitoTest {
//	
//	@InjectMocks
//	UserService service;
//	
//	@InjectMocks
//	UserService dataServiceMock;
//	
//	
////	@MockBean
//	@Mock
//	UserRepository userRepository;
//	
////	@MockBean
//	@InjectMocks
//	UserEntity user;
//	
//	
//	
////    @Before
////    public void init() {
////    	MockitoTest.initMocks(this);
////    }
//
//    @Before
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//        dataServiceMock = new UserService();
////        ReflectionTestUtils.setField(dataServiceMock, "userRepository", userRepository);
////        ReflectionTestUtils.setField(dataServiceMock, "user", user); 
//    }
//	
//
//
//
////	@Test
////	public void testUserData() {
////		UserDataService dataServiceMock = mock(UserDataService.class);
////		when(dataServiceMock.getUserById((long) 999)).thenReturn(new UserEntity());
////		UserService userService = new UserService(dataServiceMock);
//////		UserController userImpl = new UserController(dataServiceMock);
////		int result = userImpl.
//////		assertEquals(24, result);
////	}
//	
//	
////	@Mock
////	UserDataService dataServiceMock;
////
////	@InjectMocks
////	UserBusinessService userService;
////
////	@SuppressWarnings("deprecation")
////	@Test
////	public void testGetUserPid() {
////		 long id1 = 2L;
//////		when(dataServiceMock.getUserById((long) 1)).thenReturn(true);
//////		assertEquals(109, dataServiceMock.getUserPid());
////		when(dataServiceMock.getUserPid()).thenReturn(109);
////
////		Assert.assertEquals(109, dataServiceMock.getUserPid());
//////		assertEquals(userService.getUserById(id), dataServiceMockgetUserById(id));
////		
////		
//////		when(dataServiceMock.getUserPid()).thenReturn(99);
////	}
//
//	
//	
////    import org.junit.Test;
//	
//	@SuppressWarnings("deprecation")
//	@Test
//	public  void testGetUserById() {
//        
////		UserService dataServiceMock = mock(UserService.class);
//		try {
//			System.out.println("----------------------------------------------- JUnit version is: " + Version.id());
////			when(mockBPService.getProduct(any(BPRequestVO.class))).thenReturn(invalidServiceResponse);
////			when(mockBPService.getProduct(argThatMatches(someBPRequestVO)).thenReturn(whatYouWant);
//			
////			when(dataServiceMock.getUserById(any(UserEntity.class))).thenReturn(user);
//			when(dataServiceMock.getUserById(2L)).thenReturn(user);
//			
//			System.out.println("-----------------------------------------------"+user);
//			System.out.println("-----------------------------------------------"+dataServiceMock.getUserById(2L));
//			System.out.println("-----------------------------------------------"+when(dataServiceMock.getUserById(2L)).thenReturn(user));
//			
////			UserEntity result = dataServiceMock.getUserById(2L);
////			Assert.assertEquals(result, user);
//			
////			assertThat(result, is(true));
////		assertEquals(24, result);
////		assertThat(dataServiceMock.getUserById(2L)	, is(notNullValue()));
//
//		} catch (UserDefinedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	
////	@MockBean
////	private UserRepository mockRepository;
////	
////	@Before
////	@Test
////    public void init() {
////       
////        UserEntity user = new UserEntity();
////		user.setFirstName("Raj");
////		user.setLastName("N");
////	    user.setId(666999L);
////		user.setUsername("Raj_N");
////		
////		when(mockRepository.findById(999L)).thenReturn(Optional.of(user));
////
////    }
//	
//	
////	Hareesh13:04
////	Foo mock = mock(Foo.class, RETURNS_DEEP_STUBS); 
////	 
////	// note that we're stubbing a chain of methods here: getBar().getName() 
////	when(mock.getBar().getName()).thenReturn("deep"); 
////	 
////	// note that we're chaining method calls: getBar().getName() 
////	assertEquals("deep", mock.getBar().getName());
//
//	
//}
