package in.sp.main.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="employee_table")
public class EmployeeEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long id;   
	@Column
	private String name;
	@Column
	private String email; 
	@Column
	private double salary;
	@Column
	private LocalDate joiningDate;
	@Column
    private LocalDate resignationDate;
	@Column
	private String department;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public LocalDate getResignationDate() {
		return resignationDate;
	}

	public void setResignationDate(LocalDate resignationDate) {
		this.resignationDate = resignationDate;
	}

	
	public EmployeeEntity() 
	{
		
	}
	
	public EmployeeEntity(long id, String name, String email, double salary, String department, LocalDate joiningDate,
			LocalDate resignationDate) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.department = department;
		this.joiningDate = joiningDate;
		this.resignationDate = resignationDate;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary
				+ ", department=" + department + ", joiningDate=" + joiningDate + ", resignationDate=" + resignationDate
				+ "]";
	}
}
