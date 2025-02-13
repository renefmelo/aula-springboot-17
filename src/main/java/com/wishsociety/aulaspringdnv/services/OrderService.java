package com.wishsociety.aulaspringdnv.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wishsociety.aulaspringdnv.entities.Order;
import com.wishsociety.aulaspringdnv.entities.User;
import com.wishsociety.aulaspringdnv.repositories.OrderRepository;
import com.wishsociety.aulaspringdnv.repositories.UserRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
