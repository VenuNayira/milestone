package com.mindtree.milestoneassessmentone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.milestoneassessmentone.entity.Customer;
import com.mindtree.milestoneassessmentone.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customer")
	public List<Customer> retrieveAll(){
		return customerService.retrieveAll();
	}
	
	@GetMapping("/customer/{id}")
	public Customer retrieveCustomer(@PathVariable int id) {
		try {
			return customerService.retrieveCustomer(id);
			
		}catch(Exception e) {
			return null;
		}
		
	}
	
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
	
	@DeleteMapping("/customer/{id}")
	public ResponseEntity<Object> deleteCustomer(@PathVariable int id) {
		try {
			customerService.deleteCustomer(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/customer/{id}")
	public Customer updateCustomer(@RequestBody Customer customer, @PathVariable int id) {
		return customerService.updateCustomer(customer, id);
	}
}
