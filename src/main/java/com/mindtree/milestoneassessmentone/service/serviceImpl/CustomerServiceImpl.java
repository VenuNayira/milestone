package com.mindtree.milestoneassessmentone.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.milestoneassessmentone.dao.CustomerDao;
import com.mindtree.milestoneassessmentone.entity.Customer;
import com.mindtree.milestoneassessmentone.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao customerDao;

	@Override
	public List<Customer> retrieveAll() {
		// TODO Auto-generated method stub
		return customerDao.findAll();
	}

	@Override
	public Customer retrieveCustomer(int id) {
		// TODO Auto-generated method stub
		Customer customer= customerDao.getById(id);
		return customer;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.save(customer);
		return customer;
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		Customer customer = customerDao.getById(id);
		customerDao.delete(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer, int id) {
		// TODO Auto-generated method stub
		customer.setId(id);
		customerDao.save(customer);
		return customer;
	}

}
