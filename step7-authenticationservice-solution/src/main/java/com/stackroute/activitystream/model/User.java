package com.stackroute.activitystream.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
/*
 * The class "User" will be acting as the data model for the user Table in the database. Please
 * note that this class is annotated with @Entity annotation. Hibernate will scan all package for 
 * any Java objects annotated with the @Entity annotation. If it finds any, then it will begin the 
 * process of looking through that particular Java object to recreate it as a table in your database.
 *
 * Please note that you will have to use @Component annotation on this class if wish
 * to autowire the class from any other components of the application
 */
@Component
@Entity
@Table (name ="user")
public class User {
	/*
	 * This class should have three fields
	 * (username,name,password). Out of these three fields, the
	 * field username should be the primary key. This class should also contain
	 * the getters and setters for the fields.
	 */
	
	@Id
	private String username;
	private String name; 
	private String lastname;
	private String education;
	private String address;
	private String company;
	private long mobile;
	private String email;
	private String dob;
	private String password;
	
	
	
	public User(String username, String name, String lastname, String education, String address, String company,
			long mobile, String email, String dob, String password) {
		super();
		this.username = username;
		this.name = name;
		this.lastname = lastname;
		this.education = education;
		this.address = address;
		this.company = company;
		this.mobile = mobile;
		this.email = email;
		this.dob = dob;
		this.password = password;
	}

	public User(String username, String name, String password) {
		super();
		this.username = username;
		this.name = name;
		this.password = password;
	}
	
	public User() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
}