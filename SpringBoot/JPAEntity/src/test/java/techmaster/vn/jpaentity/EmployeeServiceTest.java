package techmaster.vn.jpaentity;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import lombok.extern.slf4j.Slf4j;
import techmaster.vn.jpaentity.model.Employee;
import techmaster.vn.jpaentity.service.EmployeeService;

@DataJpaTest
@Sql({"/employee.sql"})
@Slf4j
public class EmployeeServiceTest {
    @Autowired
    private EmployeeService employeeService;

    @Test
    public void getByNameTest() {
        List<Employee> employees = employeeService.getByName("Ermin");
        System.out.println(employees);
        Assertions.assertThat(employees.size()).isGreaterThan(0);
    }

    @Test
    public void getByNameAndAgeTest() {
        List<Employee> employees = employeeService.getByNameAndAge("Alphonse", 23);
        Assertions.assertThat(employees.size()).isGreaterThan(0);
    }

    @Test
    public void getByAgeAboutTest() {
        List<Employee> employees = employeeService.getByAgeAbout(20, 30);
        log.info("danh sách Employee có độ tuổi từ 20 - 30");
        employees.forEach(System.out::println);
        Assertions.assertThat(employees.size()).isGreaterThan(0);
    }
}
