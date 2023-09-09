package com.book.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "addcart")
public class CartData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	@JoinColumn(name = "userfkeyid", referencedColumnName = "userId")
	private UserRegistrationData user;

	@ManyToOne
	@JoinColumn(name = "bookfkeyid", referencedColumnName = "bookId")
	private BookDetails book;

	private int quantity;

	public CartData(UserRegistrationData user, BookDetails book, int quantity) {
		this.user = user;
		this.book = book;
		this.quantity = quantity;
	}
}