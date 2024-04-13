package ec.com.apptics.employee.service;

import ec.com.apptics.employee.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        employees.add(new Employee(1, "Ponsiano De Loor", "ponsianodeloor@gmail.com"));
        employees.add(new Employee(2, "Thomas Sizalema", "ponsianodeloor@outlook.com"));
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Employee getEmployeeById(int id) {
        return employees.stream().filter(e -> e.getId() == id).findFirst().get();
    }
}
