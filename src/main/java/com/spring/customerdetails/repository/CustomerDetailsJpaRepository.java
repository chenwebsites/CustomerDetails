package com.spring.customerdetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.customerdetails.model.CustomerDetails;

public interface CustomerDetailsJpaRepository extends JpaRepository<CustomerDetails, Long> {
	
	List<CustomerDetails> findByFirstName(String firstName);
}
