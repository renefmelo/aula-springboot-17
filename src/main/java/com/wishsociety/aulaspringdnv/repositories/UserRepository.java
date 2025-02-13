package com.wishsociety.aulaspringdnv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wishsociety.aulaspringdnv.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
