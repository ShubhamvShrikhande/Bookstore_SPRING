package com.book.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.book.dto.OrderDTO;
import com.book.model.OrderData;

@Service
public interface IOrderService {
	OrderData createOrderData(String token, OrderDTO orderdto, int bookId);

	OrderData cancelOrder(String token, int orderId);

	List<OrderData> getAllOrdersOfUser(String token);

	List<OrderData> FindAllOrders();

}