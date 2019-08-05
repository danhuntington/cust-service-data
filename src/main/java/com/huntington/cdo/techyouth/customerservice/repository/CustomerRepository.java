package com.huntington.cdo.techyouth.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huntington.cdo.techyouth.customerservice.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>
{

}
