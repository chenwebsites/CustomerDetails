package com.spring.customerdetails.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "customer_details_table")
public class CustomerDetails {

	@Id
	@GeneratedValue
	@JsonIgnore
	private long customerId;

	@Size(min = 2, max = 15, message = "First Name must have at least 2 characters")
	private String firstName;

	@Size(min = 2, max = 15, message = "Last Name must have at least 2 characters")
	private String lastName;
	
	@Digits(fraction = 0, integer = 10)
	private String phoneNumber;

	private String street;

	private String city;

	private String province;
	
	@Pattern(regexp = "^[A-Za-z]\\d[A-Za-z] \\d[A-Za-z]\\d$")
	private String postalCode;

	public CustomerDetails() {
		super();
	}

	public CustomerDetails(String first_name, String last_name, String phoneNumber, String street, String city,
			String province, String postalCode) {
		super();
		this.firstName = first_name;
		this.lastName = last_name;
		this.phoneNumber = phoneNumber;
		this.street = street;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
	}

	public long getCustomerId() {
		return customerId;
	}

	public String getFirst_name() {
		return firstName;
	}

	public String getLast_name() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getProvince() {
		return province;
	}

	public String getPostalCode() {
		return postalCode;
	}

}
