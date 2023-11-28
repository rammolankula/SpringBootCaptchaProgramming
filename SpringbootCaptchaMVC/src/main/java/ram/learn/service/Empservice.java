package ram.learn.service;

import java.util.List;
import java.util.Optional;

import ram.learn.model.Employee;

public interface Empservice {
	
	void createEmp(Employee e);
    List<Employee> getAllEmp();
    Optional<Employee> getOneEmp(Integer id);
}
