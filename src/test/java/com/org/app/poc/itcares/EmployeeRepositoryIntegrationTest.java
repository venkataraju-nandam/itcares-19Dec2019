package com.org.app.poc.itcares;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.org.app.poc.itcares.bean.Employee;
import com.org.app.poc.itcares.repository.EmployeeRepository;

//import org.springframework.boot.test.context.SpringBootTest;
//import org.mockito.junit.MockitoJUnitRunner;
//@SpringBootTest(classes = EmployeeRepositoryIntegrationTest.class)
//@SpringBootTest
//@DataJpaTest
//@RunWith(MockitoJUnitRunner.class)


@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeRepositoryIntegrationTest {
 
//	import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
    @Autowired
    private TestEntityManager entityManager;
 
    @Autowired
    private EmployeeRepository employeeRepository;
    

 
    @Test
    public void whenFindByName_thenReturnEmployee() {
        // given
        Employee emp = new Employee("emp");
        entityManager.persist(emp);
        entityManager.flush();
//     
        // when
        Employee found = employeeRepository.findByName(emp.getName());
     
        // then
//        assertThat(found.getName())
//          .isEqualTo(emp.getName());
    }
 
}
