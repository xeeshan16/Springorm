package com.zeeshan.spring.springorm.passenger.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zeeshan.spring.springorm.passenger.Passenger;
import com.zeeshan.spring.springorm.passenger.dao.PassengerDao;

public class Test {

	private static int create;

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/zeeshan/spring/springorm/passenger/test/config.xml");
		PassengerDao passengerDao = (PassengerDao) context.getBean("passengerDao");
		
		  Passenger passenger = new Passenger();
		passenger.setId(1);
		passenger.setFirstName("Iphone");
		passenger.setLastName("X");
		
		  passengerDao.create(passenger);
		// productDao.update(product);
		//  productDao.delete(product);
		
		
		//Product product = productDao.find(1);
		//List<Product> products = productDao.findAll();
		//System.out.println(products);
	}

}
