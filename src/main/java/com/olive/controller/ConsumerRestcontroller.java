package com.olive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olive.consumer.CustomerRestConsumer;
import com.olive.model.Order;

@RestController
@RequestMapping("/prod")
public class ConsumerRestcontroller {
	
	@Autowired
	private CustomerRestConsumer consumer;
	
	@GetMapping("/show")
	public String show() {
		      ResponseEntity<String> resp = consumer.show();
		     
		return "Call From Consumer App To Producer APP ! ::> " + resp.getBody()+ "_Statud Code :: "+ resp.getStatusCode();
	}
	
	@GetMapping("/create")
	public String create() {
		
		      ResponseEntity<String> resp = consumer.saveItems(new Order(10, "Mobile", 500.0));
		     
		return "Call From Consumer App To Producer APP ! ::> " + resp.getBody()+" Statuscode "+resp.getStatusCode();
	}
	
	
	@GetMapping("/all")
	public String getAll() {
		
		             ResponseEntity<List<Order>> list = consumer.getAllOrder();
		           
		return "Call From Consumer App To Producer APP ! ::> "+list.getBody() +"_"+list.getStatusCode();
	}
	
	@GetMapping("/one")
	public String getOne() {
		
		           ResponseEntity<Order> resp = consumer.getOne(10);
		           
		return "Call From Consumer App To Producer APP ! ::> "+resp.getBody() +"_"+resp.getStatusCode();
	}
	
	@GetMapping("/delete")
	public String deleteOne() {
		
		           ResponseEntity<String> resp = consumer.deleteOne(40);
		           
		return "Call From Consumer App To Producer APP ! ::> "+resp.getBody() +"_"+resp.getStatusCode();
	}
	
	@GetMapping("/edit")
	public String editProd() {
		
		           ResponseEntity<String> resp = consumer.editProd(
		        		   new Order(10, "Gug", 500.0), 50);
		           
		return "Call From Consumer App To Producer APP ! ::> "+resp.getBody() +"_"+resp.getStatusCode();
	}

}
