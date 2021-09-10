package com.olive.consumer;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.olive.model.Order;

@FeignClient("ORDER-APP")
public interface CustomerRestConsumer {
	
	@RequestMapping("order/msg")
	public ResponseEntity<String> show();
	
	@PostMapping("order/save")
	public ResponseEntity<String> saveItems(@RequestBody Order order);
                      
	@GetMapping("order/all")
	public ResponseEntity<List<Order>> getAllOrder();
	
	@GetMapping("order/one/{id}")
	public ResponseEntity<Order> getOne(@PathVariable int id);
	
	@DeleteMapping("order/delete/{id}")
	public ResponseEntity<String> deleteOne(@PathVariable int id);
	
	@PutMapping("order/edit/{id}")
	public ResponseEntity<String> editProd(
			@RequestBody Order order,
			@PathVariable int id);
	
}
