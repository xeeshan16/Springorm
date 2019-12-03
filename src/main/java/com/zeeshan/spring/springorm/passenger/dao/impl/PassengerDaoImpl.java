package com.zeeshan.spring.springorm.passenger.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.zeeshan.spring.springorm.passenger.Passenger;
import com.zeeshan.spring.springorm.passenger.dao.PassengerDao;

@Component("passengerDao")
public class PassengerDaoImpl implements PassengerDao {
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Passenger passenger) {

		Integer result = (Integer) hibernateTemplate.save(passenger);

		return result;
	}

}
