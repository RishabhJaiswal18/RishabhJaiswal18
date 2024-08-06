package com.example.cloud.address_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cloud.address_service.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
