package com.mtk.shipping.presetation.dto;

public class OrderResponse
{

	private Long orderId;
	private double shippingCost;

	public OrderResponse()
	{
	}

	public OrderResponse(Long orderId, double shippingCost)
	{
		this.orderId = orderId;
		this.shippingCost = shippingCost;
	}

	public Long getOrderId()
	{
		return orderId;
	}

	public void setOrderId(Long orderId)
	{
		this.orderId = orderId;
	}

	public double getShippingCost()
	{
		return shippingCost;
	}

	public void setShippingCost(double shippingCost)
	{
		this.shippingCost = shippingCost;
	}
}