package com.huntington.cdo.techyouth.customerservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customer")
public class Customer
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;
	
	@NotNull
	@Size(max = 45)
	@Column(name = "firstname", nullable = false)
	private String firstName;
	
	@NotNull
	@Size(max = 45)
	@Column(name = "lastname", nullable = false)	
	private String lastName;
	
	@Size(max = 60)
	@Column(name = "email", nullable = false)	
	private String emailAddress;
	
	public Customer()
	{
	}

	public Customer(@NotNull Long id, @NotNull @Size(max = 45) String firstName, @NotNull @Size(max = 45) String lastName, @Size(max = 60) String emailAddress)
	{
 		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getEmailAddress()
	{
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress)
	{
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString()
	{
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", emailAddress=" + emailAddress + "]";
	}

	
}
