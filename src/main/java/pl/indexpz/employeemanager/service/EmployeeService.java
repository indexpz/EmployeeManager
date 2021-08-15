package pl.indexpz.employeemanager.service;

import pl.indexpz.employeemanager.model.Employee;

import java.util.List;


public interface EmployeeService {

    Employee getEmployeeByID(Long id);

    Employee add(Employee employee);

    List<Employee> findAllEmployees();

    Employee update(Employee employee);

    Employee delete(Long id);

}
