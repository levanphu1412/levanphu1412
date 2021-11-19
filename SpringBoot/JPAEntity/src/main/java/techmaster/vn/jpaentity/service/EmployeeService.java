package techmaster.vn.jpaentity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techmaster.vn.jpaentity.model.Employee;
import techmaster.vn.jpaentity.repository.EmployeeRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getByName(String name) {
        return employeeRepository.getByName(name);
    }

    public List<Employee> getByNameAndAge(String name, int age) {
        List<Employee> employee1 = employeeRepository.getByName(name);
        return employee1.stream().filter(e -> e.getAge() == age).collect(Collectors.toList());
    }

    public List<Employee> getByAgeAbout(int start, int end) {
      return employeeRepository.findAll().stream().filter(e -> e.getAge() >= start && e.getAge() <= end).collect(Collectors.toList());
    }
}
