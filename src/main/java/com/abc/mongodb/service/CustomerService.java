package com.abc.mongodb.service;

import java.util.List;

import com.abc.mongodb.model.Customer;

public interface CustomerService {
	
	Customer addCustomer(Customer customer);
	
	Customer getCustomerById(int customerId);
	
	List<Customer> getAllcustomer();
	
	Customer updateCustomer(Customer customer);
	
	void deleteCustomer(int customerId);


	

}
