package com.mindtree.milestoneassessmentone.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.milestoneassessmentone.entity.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer>{
	public Customer findById(int id);

}
