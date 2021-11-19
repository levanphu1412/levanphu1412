package techmaster.vn.jpaentity;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import lombok.extern.slf4j.Slf4j;
import techmaster.vn.jpaentity.model.Employee;
import techmaster.vn.jpaentity.repository.EmployeeRepository;



import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;

@DataJpaTest
@Sql({"/employee.sql"})
@Slf4j
public class EmployeeRepositoryTest {
    @Autowired
    private EmployeeRepository employeeRepository;
   
    @Test
    public void getAllTest() {
        List<Employee> employee = employeeRepository.findAll();
        log.info("List of employee ");
        employee.forEach(System.out::println);
        Assertions.assertThat(employee.size()).isGreaterThan(0);
    }

    @Test
    public void getByIdTest() {
       Employee employee = employeeRepository.findById(5L).get();
       log.info("employee find by id ");
       System.out.println(employee);
       Assertions.assertThat(employee.getId()).isEqualTo(5L);
      
    }

    @Test  
    public void createNewEmployeeTest() {
        Employee employee = Employee.builder()
                .firstName("Phú")
                .lastName("Lê")
                .gender("Male")
                .address("Việt Nam")
                .email("levanphu5555@gmail.com")
                .salary(5000L)
                .bDay(new GregorianCalendar(1999, 02, 20).getTime())
                .build();
       employeeRepository.save(employee);
       employeeRepository.findAll().forEach(System.out::println);
       Assertions.assertThat(employee.getId()).isGreaterThan(0);
    }

    @Test
    public void updateEmployeeTest() {
        Employee employee = employeeRepository.findById(2L).get();
        employee.setFirstName("Hoang");
        employee.setLastName("Duong");
        employee.setGender("Female");
        employee.setAddress("Viet Nam");
        employee.setEmail("hoangduong1703@gmail.com");

        Employee employeeUpdated = employeeRepository.save(employee);
        Assertions.assertThat(employeeUpdated.getEmail()).isEqualTo("hoangduong1703@gmail.com");
    }

    @Test
    public void deleteEmployeeTest() {
        employeeRepository.deleteById(1L);

        Employee employee1 = null;
        Optional<Employee> optionalEmployee = employeeRepository.findById(1L);
        if(optionalEmployee.isPresent()) {
            employee1 = optionalEmployee.get();
        }

        Assertions.assertThat(employee1).isNull();
    }

    @Test
    public void findByEmailTest() {
        Optional<Employee> employee = employeeRepository.findByEmail("aramsier0@wsj.com");
        System.out.println(employee);
        Assertions.assertThat(employee).isNotEmpty();
    }


    

}
