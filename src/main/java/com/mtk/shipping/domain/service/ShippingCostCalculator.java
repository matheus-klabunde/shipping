package com.mtk.shipping.domain.service;

import com.mtk.shipping.domain.model.entity.Order;
import com.mtk.shipping.domain.strategy.ShippingStrategy;
import org.springframework.stereotype.Service;

@Service
public class ShippingCostCalculator
{

	public double calculate(Order order, ShippingStrategy strategy)
	{
		return strategy.calculateShippingCost(order);
	}
}