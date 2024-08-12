package com.example.cloud.address_service.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cloud.address_service.entity.Address;
import com.example.cloud.address_service.repository.AddressRepository;
import com.example.cloud.address_service.request.CreateAddressRequest;
import com.example.cloud.address_service.response.CreateAddressResponse;

@Service
public class AddressService {

	Logger logger = LoggerFactory.getLogger(AddressService.class);

	@Autowired
	AddressRepository addressRepository;

	public CreateAddressResponse createAddress(CreateAddressRequest createAddress) {
		
		logger.info("Inside Create Address Service ");
		
		Address address = new Address();
		address.setStreet(createAddress.getStreet());
		address.setCity(createAddress.getCity());

		addressRepository.save(address);

		CreateAddressResponse addrResponse = new CreateAddressResponse();
		addrResponse.setAddressId(address.getId());
		addrResponse.setStreet(address.getStreet());
		addrResponse.setCity(address.getCity());

		return addrResponse;
	}

	public CreateAddressResponse getById(Long id) {
		logger.info("Inside GetById Service ");
		
		Address address = addressRepository.findById(id).get(); 
		
		CreateAddressResponse addrResponse = new CreateAddressResponse();
		addrResponse.setAddressId(address.getId());
		addrResponse.setStreet(address.getStreet());
		addrResponse.setCity(address.getCity());
		
		return addrResponse;
	}

}
