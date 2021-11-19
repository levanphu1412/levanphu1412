package techmaster.vn.jpaentity.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import techmaster.vn.jpaentity.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findByEmail(String string);

    @Query(value = "SELECT * FROM employee e WHERE e.first_name LIKE :name% OR e.last_name LIKE :name%", nativeQuery = true)
    List<Employee> getByName(@Param("name") String name);
    
}
