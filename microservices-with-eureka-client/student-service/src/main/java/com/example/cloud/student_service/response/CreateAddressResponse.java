package com.example.cloud.student_service.response;

public class CreateAddressResponse {
	
	private Long addressId;
	private String street;
	private String city;

	public CreateAddressResponse() {
//		super();
	}

	public CreateAddressResponse(Long addressId, String street, String city) {
//		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

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

	@Override
	public String toString() {
		return "CreateAddressResponse [addressId=" + addressId + ", street=" + street + ", city=" + city + "]";
	}
}
