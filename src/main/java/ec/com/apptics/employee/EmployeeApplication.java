package ec.com.apptics.employee;

import ec.com.apptics.employee.model.Address;
import ec.com.apptics.employee.model.Employee;
import ec.com.apptics.employee.model.Project;
import ec.com.apptics.employee.model.Spouse;
import ec.com.apptics.employee.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialData(EmployeeService employeeService) {
		return (args) -> {
			Address address = new Address("Amazonas", "Eloy Alfaro", "OE-005", "Quito", "Pichincha", "170150");
			Project project = new Project( "Proyecto 1", "PRJ-001", "Cliente 1", "Proyecto de prueba", "2021-01-01", "2021-12-31", "Activo");
			Spouse spouse = new Spouse("Mireya", "Levy", "1717822116");

			Employee employee = new Employee("Ponsiano", "ponsianodeloor@gmail.com");

			employee.setSpouse(spouse);
			employee.addAddress(address);
			employee.addProject(project);

			employeeService.createEmployee(employee);

			System.out.println("Obtener el empleado");
			System.out.println(employeeService.getEmployeeById(1L));
		};
	}

}
