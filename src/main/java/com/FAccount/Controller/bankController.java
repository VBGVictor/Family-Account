package com.FAccount.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.FAccount.model.Bank;
import com.FAccount.repository.bankRepository;

@RestController
public class bankController {

	@Autowired
	bankRepository repository;
	
	@GetMapping("/bank")
	public List<Bank> getBank() {
		return repository.findAll();
	}
	
	@GetMapping("/bank/{id}")
	public Bank getBankId(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/bank")
	public Bank saveBank(@RequestBody Bank bank ) {
		return repository.save(bank);
	}
	
	@DeleteMapping("/bank/{id}")
	public void deleteBank(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	
}
