package in.sp.main.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String password;
	private String city;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}

/* 
 * These annotations are part of Spring Data JPA and help map a Java class to a database table.
 * @Entity – Marks a Class as a Database Table.Tells Spring that this class should be stored in the database as a table.
 * @Table(name = "product_details") – Specifies a custom name for the table instead of using the class name.
 * @Id – Primary Key of the Table
 * @GeneratedValue – Auto-Increment Primary Key.Automatically generates a unique ID for each new product.
 * @Column – Specifies a custom column name instead of using the variable name.
 * 
 * 
 *  */
