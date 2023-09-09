package com.book.service;

import java.util.List;

import com.book.dto.CartDTO;
import com.book.model.CartData;

public interface ICartService {
	CartData addToCart(String token, int bookId, CartDTO cartdto);

	void removeCart(int cartId);

	CartData updateCartQuentity(String token, int cartId, int quantity);

	List<CartData> getAllCart(String token);
}