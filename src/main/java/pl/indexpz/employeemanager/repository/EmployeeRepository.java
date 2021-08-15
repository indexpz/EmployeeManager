package pl.indexpz.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.indexpz.employeemanager.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
