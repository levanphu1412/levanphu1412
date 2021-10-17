package vn.techmaster.company.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vn.techmaster.company.repository.EmployeeDao;

@Configuration
public class RepoConfig {

    @Bean
    public EmployeeDao employeeDao() {
        return new EmployeeDao("employee.csv");
    }
}
