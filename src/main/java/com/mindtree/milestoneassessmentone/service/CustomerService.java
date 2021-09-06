package com.mindtree.milestoneassessmentone.service;

import java.util.List;

import com.mindtree.milestoneassessmentone.entity.Customer;

public interface CustomerService {
	public List<Customer> retrieveAll();
	
	public Customer retrieveCustomer(int id);
	
	public Customer addCustomer(Customer customer);
	
	public void deleteCustomer(int id);
	
	public Customer updateCustomer(Customer customer, int id);
	
}
