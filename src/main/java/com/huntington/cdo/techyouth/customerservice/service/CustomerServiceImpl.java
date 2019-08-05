package com.huntington.cdo.techyouth.customerservice.service;

import com.huntington.cdo.techyouth.customerservice.model.Customer;
import com.huntington.cdo.techyouth.customerservice.repository.CustomerRepository;
import com.huntington.cdo.techyouth.customerservice.service.exception.ServerErrorException;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class CustomerServiceImpl implements CustomerService
{
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);
	private final CustomerRepository repository; 
	
	@Autowired
	public CustomerServiceImpl(final CustomerRepository repository)
	{
		this.repository = repository;
	}

	@Override
	public Optional<Customer> getCustomer(final Long customerId)
	{
		LOGGER.debug("CustomerServiceImpl::getCustomer(): retrieving customer <" + customerId + ">");
		return repository.findById(customerId);	
	}


}
