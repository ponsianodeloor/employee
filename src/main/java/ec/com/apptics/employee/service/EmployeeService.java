package ec.com.apptics.employee.service;

import ec.com.apptics.employee.model.Employee;
import ec.com.apptics.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    //List<Employee> employees = new ArrayList<>();

    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeService() {
        //employees.add(new Employee(1, "Ponsiano De Loor", "ponsianodeloor@gmail.com"));
        //employees.add(new Employee(2, "Thomas Sizalema", "ponsianodeloor@outlook.com"));
    }

    public List<Employee> getEmployees() {
        //return employees;
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        //return employees.stream().filter(e -> e.getId() == id).findFirst().get();
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public Employee addEmployee(Employee employee) {
        /*
        //get the last employee id
        int id = employees.get(employees.size() - 1).getId();
        employee.setId(id + 1);
        employees.add(employee);
        return employee;

        //employees.add(employee);
        */
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee, Long id) {
        /*
        Employee emp = employees.stream().filter(e -> e.getId() == id).findFirst().get();
        emp.setName(employee.getName());
        emp.setEmail(employee.getEmail());
        return emp;
         */
        employee.setId(id);
        return employeeRepository.save(employee);
    }

    public Employee updateEmployeeSpouse(Employee employee, Long id) {
        Employee emp = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
        emp.setSpouse(employee.getSpouse());
        return employeeRepository.save(emp);
    }

    public void deleteEmployee(Long id) {
        //employees.removeIf(e -> e.getId() == id);
        employeeRepository.deleteById(id);
    }

    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
