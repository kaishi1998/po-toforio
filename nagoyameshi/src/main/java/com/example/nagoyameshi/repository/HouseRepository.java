package com.example.nagoyameshi.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nagoyameshi.entity.House;



public interface HouseRepository extends JpaRepository<House, Integer>{
	public Page<House> findByNameLike(String keyword,Pageable pageable);
	
	public Page<House> findByNameLike(String nameKeyword, String addressKeyword, Pageable pageable);
	public Page<House> findByCategory(String category, Pageable pageable);
	public Page<House> findByPriceLessThanEqual(Integer price, Pageable pageable);
		
	}

