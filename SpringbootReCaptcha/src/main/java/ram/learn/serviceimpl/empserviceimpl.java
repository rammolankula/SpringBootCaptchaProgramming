package ram.learn.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ram.learn.iservice.Iservice;
import ram.learn.model.Employee;
import ram.learn.repository.Emprepository;

@Service
public class empserviceimpl implements Iservice{
	
	@Autowired
	Emprepository repo;

	public Integer createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp).getId();
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
