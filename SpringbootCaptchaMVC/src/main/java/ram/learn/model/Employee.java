package ram.learn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEE_CAPTCHA")
public class Employee {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private double salary;
	@Transient
	private String captcha;
	@Transient
	private String hidden;
	@Transient
	private String image;
}
