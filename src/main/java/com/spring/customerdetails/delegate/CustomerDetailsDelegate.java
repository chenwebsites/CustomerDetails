package com.spring.customerdetails.delegate;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.customerdetails.adapter.CustomerDetailsAdapter;
import com.spring.customerdetails.model.CustomerDetails;

@Component
public class CustomerDetailsDelegate {

	@Autowired
	private CustomerDetailsAdapter cdAdapter;
	
	public CustomerDetails insertCustomer(CustomerDetails customerRequest) {
		
		CustomerDetails response = cdAdapter.insertCustomer(customerRequest);
		
		return response;
	}

	public List<CustomerDetails> retrieveCustomers() {
		
		List<CustomerDetails> response = cdAdapter.retrieveCustomers();
		
		return response;
	}
	
	public List<CustomerDetails> retrieveCustomerByName(String first_name) {

		return cdAdapter.retrieveCustomerByName(first_name);
	}

}
