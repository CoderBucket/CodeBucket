package com.spring.nifi.adminconsole;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.nifi.adminconsole.dao.OrdRepository;
import com.spring.nifi.adminconsole.model.Ord;

@RestController
public class ConsoleController {

	private final OrdRepository ordRepository;
	
	@Autowired
	public ConsoleController(OrdRepository ordRepository) {
		this.ordRepository = ordRepository;
	}
	
	@RequestMapping("/wm/order")
	public List<Ord> getWmOrders() {
		List<Ord> orderList = new ArrayList<>();
		for (Ord ord : ordRepository.findAll()) {
            System.out.println("Order: "+ ord);
            orderList.add(ord);
        }
		return orderList;	
	}
	
	@RequestMapping("/wm/{rtAdrId}")
	  public List<Ord> getWmOrder(@PathVariable("rtAdrId") String ordId) {
	    //Ord order = ordRepository.findById(ordId);
	List<Ord> order = ordRepository.findByRtAdrId(ordId);
	    System.out.println(order);
	     return order;
	  }
}
