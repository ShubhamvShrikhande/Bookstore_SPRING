package com.book.model;

import java.time.LocalDate;

import com.book.dto.OrderDTO;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "OrderDetails")
public class OrderData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int OrderId;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate orderDate;

	private int price;
	private int quantity;
	private String address;

	@ManyToOne
	@JoinColumn(name = "userfk", referencedColumnName = "userId")
	private UserRegistrationData userData;

	@ManyToOne
	@JoinColumn(name = "bookfk", referencedColumnName = "bookId")
	private BookDetails bookDetails;

	private boolean cancel = false;

	public void CreateOrder(OrderDTO orderdto) {
		this.address = orderdto.getAddress();
		this.orderDate = LocalDate.now();
		this.price = orderdto.getPrice();
		this.quantity = orderdto.getQuantity();
		this.cancel = false;
	}
}