package com.springHibernateOrm.dao;
import com.springHibernateOrm.model.Customer;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class CustomerDaoImp extends HibernateDaoSupport implements CustomerDao{

	@Override
	@Transactional
	public void saveCustomer(Customer c) 
	{
		getHibernateTemplate().save(c);
	}

	
	public void updateCustomer(Customer c) {
		
	}


	public Customer getCustomer(Customer c) {
	
		return null;
	}


	public String Customer(String cid) {
	
		return null;
	}

}
