package ram.learn.empserviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ram.learn.model.Employee;
import ram.learn.repo.Emprepo;
import ram.learn.service.Empservice;

@Service
public class empserviceimpl implements Empservice {

	@Autowired
	Emprepo emprepo;

	@Override
	public void createEmp(Employee e) {
		// TODO Auto-generated method stub
		emprepo.save(e);

	}

	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}

	@Override
	public Optional<Employee> getOneEmp(Integer id) {
		// TODO Auto-generated method stub
		return emprepo.findById(id);
	}
}
