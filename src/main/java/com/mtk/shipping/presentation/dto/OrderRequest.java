package com.mtk.shipping.presentation.dto;

public class OrderRequest
{

	private double weight;
	private String country;
	private String city;
	private String shippingType;

	public OrderRequest()
	{
	}

	public OrderRequest(double weight, String country, String city, String shippingType)
	{
		this.weight = weight;
		this.country = country;
		this.city = city;
		this.shippingType = shippingType;
	}

	public double getWeight()
	{
		return weight;
	}

	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getShippingType()
	{
		return shippingType;
	}

	public void setShippingType(String shippingType)
	{
		this.shippingType = shippingType;
	}
}