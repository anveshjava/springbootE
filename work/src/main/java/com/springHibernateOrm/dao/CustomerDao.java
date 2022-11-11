package com.springHibernateOrm.dao;

import com.springHibernateOrm.model.Customer;

public interface CustomerDao {
	
public void saveCustomer (Customer c);
public void updateCustomer (Customer c);
public Customer getCustomer(Customer c);
public String Customer(String cid);


}
