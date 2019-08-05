package com.huntington.cdo.techyouth.customerservice.service;

import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.huntington.cdo.techyouth.customerservice.model.Customer;

public interface CustomerService
{
	Optional<Customer> getCustomer(final Long customerId);
	//Customer updateCustomer(@NotNull @Valid final Customer customer);
	//Customer addCustomer(@NotNull @Valid final Customer customer);
	//void deleteCustomer(final Long customerId);
}
