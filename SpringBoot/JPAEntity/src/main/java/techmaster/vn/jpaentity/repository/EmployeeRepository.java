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

    @Query(value = "SELECT * FROM employee e WHERE CONCAT_WS(' ', e.first_name, e.last_name) LIKE %:name%", nativeQuery = true)
    List<Employee> getByName(@Param("name") String name);

    @Query(value = "SELECT * FROM employee e WHERE CONCAT_WS(' ', e.first_name, e.last_name) LIKE %:name% AND DATEFIFF(YEAR, e.BIRTH_DAY, CURRENT_DATE) = :age ", nativeQuery = true)
    List<Employee> getByNameAndAge(@Param("name") String name, @Param("age") int age);

    @Query(value = "SELECT * FROM employee e WHERE DATEDIFF(YEAR, e.BIRTH_DAY, CURRENT_DATE) >= :start AND  DATEDIFF(YEAR, e.BIRTH_DAY, CURRENT_DATE) <= :end", nativeQuery = true)
    List<Employee> getByAgeAbout(@Param("start") int start, @Param("end") int end);
}
