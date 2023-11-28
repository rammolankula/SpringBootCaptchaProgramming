package ram.learn.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ram.learn.model.Employee;

public interface Emprepo extends JpaRepository<Employee,Integer> {

}
