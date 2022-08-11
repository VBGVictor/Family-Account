package com.FAccount.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.FAccount.model.User;
import com.FAccount.repository.userRepository;

@RestController
public class userController {

	@Autowired
	userRepository repository;
	
	@GetMapping("/user")
	public List<User> getUser() {
		return repository.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User getUserId(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user) {
		return repository.save(user);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	
}
