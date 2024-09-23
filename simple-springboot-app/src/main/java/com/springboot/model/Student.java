package com.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;

@Entity // Annotate the class as an entity
public class Student implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	@Id // Indicate that this field is the primary key
	private String id;
	private String firstName;
	private String lastName;
	private int age; // Changed to int

	// No-argument constructor
	public Student() {
	}

	// Parameterized constructor
	public Student(String id, String firstName, String lastName, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	// Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() { // Change return type to int
		return age;
	}

	public void setAge(int age) { // Change parameter type to int
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student{id='" + id + "', firstName='" + firstName + "', lastName='" + lastName + "', age=" + age + "}";
	}
}
