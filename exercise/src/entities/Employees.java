package entities;

import java.util.Random;

public class Employees {
	private String name;
	private Integer id;
	private Integer salary;
	
	public void Employees(String name, Integer salary) {
		Random id = new Random();
		this.id = id.nextInt(100);
		this.name = name;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setId() {
		Random idRandom = new Random();
		this.id = idRandom.nextInt();
	}
	
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public Integer getSalary() {
		return salary;
	}
}
