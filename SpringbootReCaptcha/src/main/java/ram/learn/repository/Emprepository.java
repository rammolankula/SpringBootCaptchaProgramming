package ram.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ram.learn.model.Employee;

public interface Emprepository extends JpaRepository<Employee, Integer>{

}
