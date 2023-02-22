package com.spring.customerdetails.adapter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.customerdetails.model.CustomerDetails;
import com.spring.customerdetails.repository.CustomerDetailsJpaRepository;

@Component
public class CustomerDetailsAdapter {

	@Autowired
	private CustomerDetailsJpaRepository cdRepository;

	public CustomerDetails insertCustomer(CustomerDetails customerRequest) {

		return cdRepository.save(customerRequest);
	}

	public List<CustomerDetails> retrieveCustomers() {

		return cdRepository.findAll();
	}

	public List<CustomerDetails> retrieveCustomerByName(String firstName) {

		return cdRepository.findByFirstName(firstName);
	}

}
