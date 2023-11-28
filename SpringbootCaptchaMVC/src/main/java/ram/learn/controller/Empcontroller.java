package ram.learn.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.apiclub.captcha.Captcha;
import ram.learn.captchaobject.Utilcaptcha;
import ram.learn.model.Employee;
import ram.learn.service.Empservice;

@Controller
@RequestMapping("/emp")
public class Empcontroller {

	@Autowired
	private Empservice iservice;

	private void setupcaptcha(Employee employee) {
		Captcha captcha = Utilcaptcha.createCaptcha(250, 50);
		employee.setHidden(captcha.getAnswer());
		employee.setCaptcha("");// user need to enter
		employee.setImage(Utilcaptcha.encodebase64(captcha));

	}

	@GetMapping("/register")
	public String showregisterpage(Model model) {
		Employee e = new Employee();
		setupcaptcha(e);
		model.addAttribute("employee", e);
		return "empregister";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute Employee employee, Model model) {

		if (employee.getCaptcha().equals(employee.getHidden())) {
			iservice.createEmp(employee);
			model.addAttribute("message", "emplyee created");
			return "redirect:all";
		} else {
			model.addAttribute("message", "invalid captcha");
			setupcaptcha(employee);
			model.addAttribute("employee", employee);
		}
		return "empregister";
	}

	@GetMapping("/all")
	public String getAllemp(Model model) {
		List<Employee> list = iservice.getAllEmp();
		model.addAttribute("list", list);
		return "emplist";

	}
   
	@GetMapping("/edit/{id}")
	public String editemp(@PathVariable Integer id,Model model) {
		
		Optional<Employee> opt=iservice.getOneEmp(id);
		String page=null;
		if(opt.isPresent()) {
			Employee e=opt.get();
			setupcaptcha(e);
			model.addAttribute("employee",e);
			page="empregister";
		}else {
			page="redirect:all";
		}
		return page;
		
	}
}
