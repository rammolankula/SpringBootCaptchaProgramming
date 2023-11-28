package ram.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ram.learn.iservice.Iservice;
import ram.learn.model.Employee;

@Controller
@RequestMapping("/employee")
public class Empcontroller {
	
	
	@Autowired
	Iservice service;
	
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("employee",new Employee());
		return "EmpRegister";
	}
	
	@PostMapping("/save")
	public String saveemp(@ModelAttribute Employee emp,Model model) {
		Integer id=service.createEmployee(emp);
		model.addAttribute("message","employee '"+id+"'saved");
		model.addAttribute("employee",new Employee());
		return "EmpRegister";
		
	}

	
	@GetMapping("/all")
	public String getAllemp(Model model) {
		
		List<Employee> list=service.getAllEmployees();
		model.addAttribute("list",list);
		return "EmpDetails";
		
	}
	
}
