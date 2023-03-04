package com.spring.customerdetails.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.customerdetails.delegate.CustomerDetailsDelegate;
import com.spring.customerdetails.model.CustomerDetails;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/customer-details")
public class CustomerDetailsController {
	
	private final Log log = LogFactory.getLog(CustomerDetailsController.class);
	
	@Autowired
	private CustomerDetailsDelegate cdDelegate;

	@PostMapping("/add-customer")
	public ResponseEntity<CustomerDetails> insertCustomer(@Valid @RequestBody CustomerDetails customerRequest)
			throws Exception {

		CustomerDetails response = cdDelegate.insertCustomer(customerRequest);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@GetMapping("/retrieve-customers")
	public ResponseEntity<List<CustomerDetails>> retrieveCustomers() throws Exception {

		List<CustomerDetails> response = cdDelegate.retrieveCustomers();

		return new ResponseEntity<>(response, HttpStatus.OK);

	}
	
	@GetMapping("/retrieve-customer-by-firstname/{first_name}")
	public ResponseEntity<List<CustomerDetails>> retrieveCustomerByName(@PathVariable String first_name) throws Exception {

		List<CustomerDetails> response = cdDelegate.retrieveCustomerByName(first_name);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}
	
	
	
	

}
