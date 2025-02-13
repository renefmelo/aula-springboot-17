package com.wishsociety.aulaspringdnv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wishsociety.aulaspringdnv.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
