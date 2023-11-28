package ram.learn.iservice;

import java.util.List;

import ram.learn.model.Employee;

public interface Iservice {
	
	Integer createEmployee(Employee emp);
	List<Employee> getAllEmployees();
	

}
