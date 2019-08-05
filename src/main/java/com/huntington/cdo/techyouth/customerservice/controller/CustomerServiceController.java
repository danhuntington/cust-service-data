package com.huntington.cdo.techyouth.customerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger; 
import org.slf4j.LoggerFactory; 
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import javax.validation.Valid; 

import com.huntington.cdo.techyouth.customerservice.model.Customer;
import com.huntington.cdo.techyouth.customerservice.service.CustomerService;
import com.huntington.cdo.techyouth.customerservice.service.exception.ServerErrorException;

@RestController
public class CustomerServiceController
{
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceController.class);
	private final CustomerService customerService;
	
	@Autowired
	public CustomerServiceController(final CustomerService customerService)
	{
		this.customerService = customerService;
	}
	
	@ApiOperation(value = "Retrieve a single customer by id",
			response = Customer.class)	
	@RequestMapping(value = "/customer/{id}", method = RequestMethod.GET, produces = {
			"application/json" })
	public Customer getCustomer(@PathVariable Long id)
	{
		LOGGER.debug("Received request to fetch customer <" + id + ">");
		Optional<Customer> custval = customerService.getCustomer(id);
		return custval.orElse(null);
	}

	@ExceptionHandler
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public String handleServerErrorException(ServerErrorException e)
	{
		return e.getMessage();
	}	

}
