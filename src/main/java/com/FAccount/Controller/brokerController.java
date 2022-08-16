package com.FAccount.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.FAccount.model.Broker;
import com.FAccount.repository.brokerRepository;

@RestController
public class brokerController {

	@Autowired
	brokerRepository repository;
	
	@GetMapping("/broker")
	public List<Broker> getBroker() {
		return repository.findAll();
	}
	
	@GetMapping("/broker/{id}")
	public Broker getBrokerId(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/broker")
	public Broker saveBroker(@RequestBody Broker broker) {
		return repository.save(broker);
	}
	
	@DeleteMapping("/broker/{id}")
	public void deleteBroker(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	
}
