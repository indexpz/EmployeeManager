package pl.indexpz.employeemanager.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.indexpz.employeemanager.exceptions.ResourceNotFoundException;
import pl.indexpz.employeemanager.model.Employee;
import pl.indexpz.employeemanager.repository.EmployeeRepository;
import pl.indexpz.employeemanager.service.EmployeeService;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImplement implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImplement(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee getEmployeeByID(Long id) {
        return employeeRepository.findById(id).orElseThrow((()-> new ResourceNotFoundException("User by id: " + id + " was not found!")));
    }

    @Override
    public Employee add(Employee employee) {
//        Generowanie kodu dla pracownika
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee delete(Long id) {
        employeeRepository.delete(getEmployeeByID(id));
        return null;
    }


}
