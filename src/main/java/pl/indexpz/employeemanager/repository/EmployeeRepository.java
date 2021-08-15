package pl.indexpz.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.indexpz.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findEmployeeById(Long id);


}
