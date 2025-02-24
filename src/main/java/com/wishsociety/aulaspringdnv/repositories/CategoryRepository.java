package com.wishsociety.aulaspringdnv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wishsociety.aulaspringdnv.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
