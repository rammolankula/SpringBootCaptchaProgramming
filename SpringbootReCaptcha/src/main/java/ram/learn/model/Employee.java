package ram.learn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="TBL_RECAPTCA")
public class Employee {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private double salary;
	private String address;

}
