package com.example.cloud.student_service.response;

import com.example.cloud.student_service.entity.Student;

public class StudentResponse {

	private long id;

	private String firstName;

	private String lastName;

	private String email;

	private CreateAddressResponse addressResponse;

	public StudentResponse(Student student) {
		this.id = student.getId();
		this.firstName = student.getFirstName();
		this.lastName = student.getLastName();
		this.email = student.getEmail();

//		this.street = student.getAddress().getStreet();
//		this.city = student.getAddress().getCity();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CreateAddressResponse getAddressResponse() {
		return addressResponse;
	}

	public void setAddressResponse(CreateAddressResponse addressResponse) {
		this.addressResponse = addressResponse;
	}

}
