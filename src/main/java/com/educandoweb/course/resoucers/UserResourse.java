package com.educandoweb.course.resoucers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResourse {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria Nilza", "maria@gmail.com", "99999-9999", "12345");
		return ResponseEntity.ok().body(u);
	}

}
