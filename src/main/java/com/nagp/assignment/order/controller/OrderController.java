package com.nagp.assignment.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.assignment.order.responsevo.OrderList;
import com.nagp.assignment.order.service.OrderService;

@RestController
@RequestMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
public class OrderController {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);

	@Autowired
	OrderService orderService;

	@GetMapping(value = "/order/{orderId}")
	public ResponseEntity<OrderList> getUserDetails(@RequestHeader(value = "locale", defaultValue = "en") String locale,
			@PathVariable("orderId") int orderId) {

		LOGGER.info("Calling service method to get order detail");
		return new ResponseEntity<>(orderService.getOrder(orderId), HttpStatus.OK);
	}
}
