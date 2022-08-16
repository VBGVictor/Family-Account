package com.FAccount.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.FAccount.model.Account;
import com.FAccount.repository.accountRepository;

@RestController
public class accountController {

	@Autowired
	accountRepository repository;
	
	@GetMapping("/account")
	public List<Account> getBroker() {
		return repository.findAll();
	}
	
	@GetMapping("/account/{id}")
	public Account getAccountId(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/account")
	public Account saveAccount(@RequestBody Account account) {
		return repository.save(account);
	}
	
	@DeleteMapping("/account/{id}")
	public void deleteAccount(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	
}
