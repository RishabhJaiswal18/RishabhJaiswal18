package com.example.cloud.student_service.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.cloud.student_service.response.CreateAddressResponse;

//if not using Eureka server then we use url for communicating from one microservice to other
//@FeignClient(url = "${address.service.url}",value = "address-feign-client",path = "/api/address")
@FeignClient(value = "address-service",path = "/api/address")
public interface AddressFeignClient {
	
	@GetMapping("/getById/{id}")
	public CreateAddressResponse getById(@PathVariable Long id);
}
