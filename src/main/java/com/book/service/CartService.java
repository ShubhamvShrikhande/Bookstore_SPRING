package com.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.dto.CartDTO;
import com.book.model.BookDetails;
import com.book.model.CartData;
import com.book.model.UserRegistrationData;
import com.book.repository.BookDetailsRepository;
import com.book.repository.CartRepository;
import com.book.repository.UserRegistrationRepository;
import com.book.tokenutil.TokenUtil;

@Service
public class CartService implements ICartService
 {
	@Autowired
	CartRepository cartRepository;
	@Autowired
	BookDetailsRepository bookrepo;
	@Autowired
	TokenUtil tokenUtil;

	@Autowired
	UserRegistrationRepository userRepository;

	@Override
	public CartData addToCart(String token, int bookId, CartDTO cartdto) {
		int id = tokenUtil.decodeToken(token);
		Optional<UserRegistrationData> isPresent = userRepository.findById(id);
		if (isPresent.isPresent()) {
			BookDetails books = bookrepo.getById(bookId);
			CartData cart = new CartData(isPresent.get(), books, cartdto.getQuantity());
			return cartRepository.save(cart);
		} else {
			return null;
		}
	}

	@Override
	public void removeCart(int cartId) {
		cartRepository.deleteById(cartId);

	}

	@Override
	public CartData updateCartQuentity(String token, int cartId, int quantity) {
		int id = tokenUtil.decodeToken(token);
		Optional<UserRegistrationData> isPresent = userRepository.findById(id);
		if (isPresent.isPresent()) {
			CartData cart = cartRepository.getById(cartId);
			cart.setQuantity(quantity);
			return cartRepository.save(cart);
		} else {
			return null;
		}

	}

	@Override
	public List<CartData> getAllCart(String token) {
		int id = tokenUtil.decodeToken(token);
		Optional<UserRegistrationData> isPresent = userRepository.findById(id);
		if (isPresent.isPresent()) {
			List<CartData> cartProduct = cartRepository.findAll();
			return cartProduct;
		} else {
			return null;
		}
		@Autowired
		CartRepository cartRepository;
		@Autowired
		BookDetailsRepository bookrepo;
		@Autowired
		TokenUtil tokenUtil;

		@Autowired
		UserRegistrationRepository userRepository;

		@Override
		public CartData addToCart(String token, int bookId, CartDTO cartdto) {
			int id = tokenUtil.decodeToken(token);
			Optional<UserRegistrationData> isPresent = userRepository.findById(id);
			if (isPresent.isPresent()) {
				BookDetails books = bookrepo.getById(bookId);
				CartData cart = new CartData(isPresent.get(), books, cartdto.getQuantity());
				return cartRepository.save(cart);
			} else {
				return null;
			}
		}

		@Override
		public void removeCart(int cartId) {
			cartRepository.deleteById(cartId);

		}

		@Override
		public CartData updateCartQuentity(String token, int cartId, int quantity) {
			int id = tokenUtil.decodeToken(token);
			Optional<UserRegistrationData> isPresent = userRepository.findById(id);
			if (isPresent.isPresent()) {
				CartData cart = cartRepository.getById(cartId);
				cart.setQuantity(quantity);
				return cartRepository.save(cart);
			} else {
				return null;
			}

		}

		@Override
		public List<CartData> getAllCart(String token) {
			int id = tokenUtil.decodeToken(token);
			Optional<UserRegistrationData> isPresent = userRepository.findById(id);
			if (isPresent.isPresent()) {
				List<CartData> cartProduct = cartRepository.findAll();
				return cartProduct;
			} else {
				return null;
			}

		}
	}@Autowired
	CartRepository cartRepository;
	@Autowired
	BookDetailsRepository bookrepo;
	@Autowired
	TokenUtil tokenUtil;

	@Autowired
	UserRegistrationRepository userRepository;

	@Override
	public CartData addToCart(String token, int bookId, CartDTO cartdto) {
		int id = tokenUtil.decodeToken(token);
		Optional<UserRegistrationData> isPresent = userRepository.findById(id);
		if (isPresent.isPresent()) {
			BookDetails books = bookrepo.getById(bookId);
			CartData cart = new CartData(isPresent.get(), books, cartdto.getQuantity());
			return cartRepository.save(cart);
		} else {
			return null;
		}
	}

	@Override
	public void removeCart(int cartId) {
		cartRepository.deleteById(cartId);

	}

	@Override
	public CartData updateCartQuentity(String token, int cartId, int quantity) {
		int id = tokenUtil.decodeToken(token);
		Optional<UserRegistrationData> isPresent = userRepository.findById(id);
		if (isPresent.isPresent()) {
			CartData cart = cartRepository.getById(cartId);
			cart.setQuantity(quantity);
			return cartRepository.save(cart);
		} else {
			return null;
		}

	}

	@Override
	public List<CartData> getAllCart(String token) {
		int id = tokenUtil.decodeToken(token);
		Optional<UserRegistrationData> isPresent = userRepository.findById(id);
		if (isPresent.isPresent()) {
			List<CartData> cartProduct = cartRepository.findAll();
			return cartProduct;
		} else {
			return null;
		}

	}
}@Autowired
	CartRepository cartRepository;
	@Autowired
	BookDetailsRepository bookrepo;
	@Autowired
	TokenUtil tokenUtil;

	@Autowired
	UserRegistrationRepository userRepository;

	@Override
	public CartData addToCart(String token, int bookId, CartDTO cartdto) {
		int id = tokenUtil.decodeToken(token);
		Optional<UserRegistrationData> isPresent = userRepository.findById(id);
		if (isPresent.isPresent()) {
			BookDetails books = bookrepo.getById(bookId);
			CartData cart = new CartData(isPresent.get(), books, cartdto.getQuantity());
			return cartRepository.save(cart);
		} else {
			return null;
		}
	}

	@Override
	public void removeCart(int cartId) {
		cartRepository.deleteById(cartId);

	}

	@Override
	public CartData updateCartQuentity(String token, int cartId, int quantity) {
		int id = tokenUtil.decodeToken(token);
		Optional<UserRegistrationData> isPresent = userRepository.findById(id);
		if (isPresent.isPresent()) {
			CartData cart = cartRepository.getById(cartId);
			cart.setQuantity(quantity);
			return cartRepository.save(cart);
		} else {
			return null;
		}

	}

	@Override
	public List<CartData> getAllCart(String token) {
		int id = tokenUtil.decodeToken(token);
		Optional<UserRegistrationData> isPresent = userRepository.findById(id);
		if (isPresent.isPresent()) {
			List<CartData> cartProduct = cartRepository.findAll();
			return cartProduct;
		} else {
			return null;
		}

	}
}
	}
}