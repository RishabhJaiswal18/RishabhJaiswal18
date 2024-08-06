package com.example.cloud.student_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cloud.student_service.entity.Address;
import com.example.cloud.student_service.entity.Student;
import com.example.cloud.student_service.feignclients.AddressFeignClient;
import com.example.cloud.student_service.repository.StudentRepository;
import com.example.cloud.student_service.request.CreateStudentRequest;
import com.example.cloud.student_service.response.StudentResponse;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

//	@Autowired
//	WebClient webClient;

	@Autowired
	AddressFeignClient addressFeignClient;

//	@Autowired
//	AddressRepository addressRepository;

	public StudentResponse createStudent(CreateStudentRequest createStudentRequest) {

		Address address = new Address();
		address.setStreet(createStudentRequest.getStreet());
		address.setCity(createStudentRequest.getCity());
//
//		address = addressRepository.save(address);

		Student student = new Student();
		student.setFirstName(createStudentRequest.getFirstName());
		student.setLastName(createStudentRequest.getLastName());
		student.setEmail(createStudentRequest.getEmail());

//		student.setAddressId(createStudentRequest.getAddressId());
		student.setAddress(address);
		
		
		student = studentRepository.save(student);

		StudentResponse studentResponse = new StudentResponse(student);
//		studentResponse.setAddressResponse(getAddressById(student.getAddressId()));
		studentResponse.setAddressResponse(addressFeignClient.getById(student.getAddress().getId()));

		return studentResponse;
	}

	public StudentResponse getById(long id) {
//		return new StudentResponse(studentRepository.findById(id).get());
		Student student = studentRepository.findById(id).get();
		StudentResponse studentResponse = new StudentResponse(student);
//		studentResponse.setAddressResponse(getAddressById(student.getAddressId()));
		
//		studentResponse.setAddressResponse(addressFeignClient.getById(student.getAddressId()));
		
		studentResponse.setAddressResponse(addressFeignClient.getById(student.getAddress().getId()));

		return studentResponse;
	}

//	public CreateAddressResponse getAddressById(long addressId) {
//		Mono<CreateAddressResponse> addressResponse = webClient.get().uri("/getById/" + addressId).retrieve()
//				.bodyToMono(CreateAddressResponse.class);
//		return addressResponse.block();
//	}
}
