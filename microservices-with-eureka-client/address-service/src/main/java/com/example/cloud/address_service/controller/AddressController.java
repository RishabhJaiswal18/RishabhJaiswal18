package com.example.cloud.address_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cloud.address_service.request.CreateAddressRequest;
import com.example.cloud.address_service.response.CreateAddressResponse;
import com.example.cloud.address_service.service.AddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/address")
public class AddressController {

	@Autowired
	AddressService addressService;

	@PostMapping("/create")
	public CreateAddressResponse createAddress(@RequestBody CreateAddressRequest createAddress) {
		return addressService.createAddress(createAddress);
	}

	@GetMapping("/getById/{id}")
	public CreateAddressResponse getById(@PathVariable Long id) {
		return addressService.getById(id);
	}

}
