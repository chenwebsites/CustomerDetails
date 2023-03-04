package com.spring.customerdetails.adapter;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.spring.customerdetails.controller.CustomerDetailsController;
import com.spring.customerdetails.model.CustomerDetails;
import com.spring.customerdetails.repository.CustomerDetailsJpaRepository;

@Component
public class CustomerDetailsAdapter {

	private final Log log = LogFactory.getLog(CustomerDetailsAdapter.class);

	@Autowired
	private CustomerDetailsJpaRepository cdRepository;

	public CustomerDetails insertCustomer(CustomerDetails customerRequest) {

		return cdRepository.save(customerRequest);
	}

	public List<CustomerDetails> retrieveCustomers() {

		List<CustomerDetails> response = cdRepository.findAll();
		log.info(response);
		return response;
	}

	public List<CustomerDetails> retrieveCustomerByName(String firstName) {

		return cdRepository.findByFirstName(firstName);
	}

}
