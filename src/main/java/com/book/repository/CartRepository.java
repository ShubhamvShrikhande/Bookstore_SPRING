package com.book.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.model.CartData;
@Repository
public interface CartRepository extends JpaRepository<CartData, Integer> {
	List<CartData> findAll();

}
