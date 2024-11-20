package com.mtk.shipping.domain.model.vo;

import jakarta.persistence.Embeddable;

@Embeddable
public record Destination(String country, String city)
{

	public Destination
	{
		if (country == null || country.isEmpty())
		{
			throw new IllegalArgumentException("Country must not be null or empty");
		}
		if (city == null || city.isEmpty())
		{
			throw new IllegalArgumentException("City must not be null or empty");
		}
	}
}
