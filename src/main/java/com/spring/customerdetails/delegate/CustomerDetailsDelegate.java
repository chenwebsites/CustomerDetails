package com.spring.customerdetails.delegate;


import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.customerdetails.adapter.CustomerDetailsAdapter;
import com.spring.customerdetails.model.CustomerDetails;

@Component
public class CustomerDetailsDelegate {

	private final Log log = LogFactory.getLog(CustomerDetailsDelegate.class);
	
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
