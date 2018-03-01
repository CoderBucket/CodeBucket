package com.spring.nifi.adminconsole;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.spring.nifi.adminconsole.dao.OrdRepository;
import com.spring.nifi.adminconsole.model.Ord;
import com.spring.nifi.adminconsole.tm.model.Shpm_T;
import com.spring.nifi.adminconsole.tmdao.ShipmentRepository;

@SpringBootApplication
public class AdminConsoleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AdminConsoleApplication.class, args);
	}

	@Autowired
	DataSource dataSource;

	@Autowired
	DataSource tmDataSource;

	@Autowired
	ShipmentRepository shipmentRepository;

	@Autowired
	OrdRepository ordRepository;

	@Transactional(readOnly = true)
	@Override
	public void run(String... args) throws Exception {
		System.out.println("DATASOURCE = **********************" + dataSource);
		System.out.println("DATASOURCE = **********************" + tmDataSource);

		
		  System.out.println("*******************************findAll()****************"
		  ); for (Ord ord : ordRepository.findAll()) { System.out.println(ord); }
		  
		  System.out.println("************************Done***************************")
		  ;
		  
		  System.out.println("*******************************findAll()****************"
		  ); for (Shpm_T shipment : shipmentRepository.findAll()) {
		  System.out.println(shipment); }
		  
		 
		System.out.println("************************Done***************************");
	}
}
