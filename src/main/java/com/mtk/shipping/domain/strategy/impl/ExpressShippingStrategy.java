package com.mtk.shipping.domain.strategy.impl;

import com.mtk.shipping.domain.model.entity.Order;
import com.mtk.shipping.domain.strategy.ShippingStrategy;
import org.springframework.stereotype.Component;

@Component("expressShippingStrategy")
public class ExpressShippingStrategy implements ShippingStrategy
{

	@Override
	public double calculateShippingCost(Order order)
	{
		return order.getWeight() * 1.5;
	}
}