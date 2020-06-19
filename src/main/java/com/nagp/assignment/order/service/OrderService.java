package com.nagp.assignment.order.service;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.nagp.assignment.order.responsevo.OrderList;
import com.nagp.assignment.order.responsevo.OrderList.OrderDetails;

/**
 * Service class to perform user related business logic.
 * 
 * @author Yogendra
 */
@Service
public class OrderService {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrderService.class);

	public OrderList getOrder(int id) {

		LOGGER.info("Creating mock orders to prepare response");
		OrderList orders = new OrderList();
		OrderDetails order1 = new OrderDetails(001, 500.10, new SimpleDateFormat("dd-MMM-yyyy").format(new Date()));
		OrderDetails order2 = new OrderDetails(002, 1000.55, new SimpleDateFormat("dd-MMM-yyyy").format(new Date()));
		OrderDetails order3 = new OrderDetails(003, 1500.00, new SimpleDateFormat("dd-MMM-yyyy").format(new Date()));

		orders.setOrders(Arrays.asList(order1, order2, order3));

		return orders;

	}

}
