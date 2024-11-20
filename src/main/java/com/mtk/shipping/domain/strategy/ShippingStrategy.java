package com.mtk.shipping.domain.strategy;

import com.mtk.shipping.domain.model.entity.Order;

public interface ShippingStrategy
{

	double calculateShippingCost(Order order);
}
