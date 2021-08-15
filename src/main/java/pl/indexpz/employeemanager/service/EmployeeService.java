package pl.indexpz.employeemanager.service;

import org.springframework.stereotype.Service;
import pl.indexpz.employeemanager.model.Employee;

import java.util.List;


public interface EmployeeService {

    Employee getEmployeeByID(Long id);

    Employee add(Employee employee);

    List<Employee> findAllEmployees();

    Employee update(Employee employee);

    void delete(Long id);

}
