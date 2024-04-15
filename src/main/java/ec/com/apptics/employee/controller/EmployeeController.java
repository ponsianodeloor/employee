package ec.com.apptics.employee.controller;

import ec.com.apptics.employee.model.Employee;
import ec.com.apptics.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getEmployee() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        Employee createEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(createEmployee, HttpStatus.CREATED).getBody();
    }

    /*@RequestMapping(value = "/employee", method = RequestMethod.POST)
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }*/

    @PutMapping("/employee/{id}/update")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable Long id) {
        Employee updatedEmployee = employeeService.updateEmployee(employee, id);
        return new ResponseEntity<>(updatedEmployee, HttpStatus.ACCEPTED).getBody();
    }

    //update employee spouse
    @PutMapping("/employee/{id}/update/spouse")
    public Employee updateEmployeeSpouse(@RequestBody Employee employee, @PathVariable Long id) {
        Employee updatedEmployee = employeeService.updateEmployeeSpouse(employee, id);
        return new ResponseEntity<>(updatedEmployee, HttpStatus.ACCEPTED).getBody();
    }

    @DeleteMapping("/employee/{id}/delete")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>("Employee deleted successfully", HttpStatus.OK);
    }
}
