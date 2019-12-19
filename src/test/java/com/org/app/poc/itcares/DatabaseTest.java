/*	
 * This is DatabaseTest using DatabaseDAO, DatabaseRepository classes is executed succesfully in
 * other project.
 *  
 * To run this DatabaseTest which is using MOCKITOJUNITRUNNER, 
 * 	should delete Junit5 (jupiter...)dependencies from POM.
 * 	But, if those depencies deleted, currently working CUCUMBER tests not running
*/




//package com.org.app.poc.itcares;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
// 
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import com.org.app.poc.itcares.bean.DatabaseDAO;
//import com.org.app.poc.itcares.service.DatabaseService;
// 
// 
//@RunWith(MockitoJUnitRunner.class)
//public class DatabaseTest 
//{
//    @InjectMocks
//    DatabaseService recordService;
//     
//    @Mock  //Working in my MockitoJunitTest poc, but not here due to Junit5 I believe (not jupiter junit in that POM)
//    @MockBean
//    DatabaseDAO databaseMock;
//
//     
//    @Test
//    public void saveTest()
//    {
//        boolean saved = recordService.save("temp.txt");
//        assertEquals(true, saved);
//         
//        verify(databaseMock, times(1)).save("temp.txt");
//    }
//}
//
////Let’s understand above test class step by step:
////
////Annotate the test with the @RunWith(MockitoJUnitRunner.class) so that mockito can process the annotations.
////Annotate the dao fields with the @Mock annotation to have a mock object instantiated for both of them.
////Annotate service field with the @InjectMocks annotation to first instantiate and then inject both mocked dependencies.
////Call the method to test on the class to be tested ie. recordService.
////Verify that methods in the mocked objects have been invoked.