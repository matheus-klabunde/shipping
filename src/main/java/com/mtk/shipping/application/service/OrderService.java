package com.mtk.shipping.application.service;

import com.mtk.shipping.domain.model.entity.Order;
import com.mtk.shipping.domain.repository.OrderRepository;
import com.mtk.shipping.domain.service.ShippingCostCalculator;
import com.mtk.shipping.domain.strategy.ShippingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService
{

	private final OrderRepository orderRepository;
	private final ShippingCostCalculator shippingCostCalculator;

	@Autowired
	public OrderService(OrderRepository orderRepository, ShippingCostCalculator shippingCostCalculator)
	{
		this.orderRepository = orderRepository;
		this.shippingCostCalculator = shippingCostCalculator;
	}

	public double calculateShipping(Order order, ShippingStrategy strategy)
	{
		double cost = shippingCostCalculator.calculate(order, strategy);
		orderRepository.save(order);
		return cost;
	}
}