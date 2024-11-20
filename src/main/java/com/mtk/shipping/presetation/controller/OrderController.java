package com.mtk.shipping.presetation.controller;

import com.mtk.shipping.application.service.OrderService;
import com.mtk.shipping.domain.model.entity.Order;
import com.mtk.shipping.domain.model.vo.Destination;
import com.mtk.shipping.domain.strategy.ShippingStrategy;
import com.mtk.shipping.presetation.dto.OrderRequest;
import com.mtk.shipping.presetation.dto.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@RestController
@RequestMapping("/orders")
public class OrderController
{

	private final OrderService orderService;
	private final ShippingStrategy standardShippingStrategy;
	private final ShippingStrategy expressShippingStrategy;

	@Autowired
	public OrderController(OrderService orderService,
		@Qualifier("standardShippingStrategy") ShippingStrategy standardShippingStrategy,
		@Qualifier("expressShippingStrategy") ShippingStrategy expressShippingStrategy)
	{
		this.orderService = orderService;
		this.standardShippingStrategy = standardShippingStrategy;
		this.expressShippingStrategy = expressShippingStrategy;
	}

	@GetMapping("/hello")
	public String helloUser()
	{
		return "Hello User";
	}

	@PostMapping("/calculateShipping")
	public OrderResponse calculateShipping(@RequestBody OrderRequest orderRequest)
	{
		Destination destination = new Destination(orderRequest.getCountry(), orderRequest.getCity());
		Order order = new Order(orderRequest.getWeight(), destination);

		ShippingStrategy strategy;
		if ("express".equalsIgnoreCase(orderRequest.getShippingType()))
		{
			strategy = expressShippingStrategy;
		}
		else
		{
			strategy = standardShippingStrategy;
		}

		double cost = orderService.calculateShipping(order, strategy);

		return new OrderResponse(order.getId(), cost);
	}
}