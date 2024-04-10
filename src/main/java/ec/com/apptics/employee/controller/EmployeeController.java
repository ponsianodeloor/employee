package ec.com.apptics.employee.controller;

import ec.com.apptics.employee.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employee")
    public List<Employee> getEmployee() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Ponsiano De Loor", "ponsianodeloor@gmail.com"));
        employees.add(new Employee(2, "Thomas Sizalema", "ponsianodeloor@outlook.com"));
        return employees;
    }

}
