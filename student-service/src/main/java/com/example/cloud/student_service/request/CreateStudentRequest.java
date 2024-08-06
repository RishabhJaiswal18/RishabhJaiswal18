package com.example.cloud.student_service.request;

public class CreateStudentRequest {

	private String firstName;

	private String lastName;

	private String email;

//	private long addressId;

	private String street;

	private String city;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

//	public long getAddressId() {
//		return addressId;
//	}
//
//	public void setAddressId(long addressId) {
//		this.addressId = addressId;
//	}

}
