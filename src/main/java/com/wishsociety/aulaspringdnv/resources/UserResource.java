package com.wishsociety.aulaspringdnv.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wishsociety.aulaspringdnv.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Yushi", "tokunoyuu@gmail.com", "14999020412", "tknysh123");
		return ResponseEntity.ok().body(u);
	}
}
