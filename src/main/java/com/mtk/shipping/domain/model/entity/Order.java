package com.mtk.shipping.domain.model.entity;

import com.mtk.shipping.domain.model.vo.Destination;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "orders")
public class Order implements Serializable
{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private double weight;

	@Embedded
	private Destination destination;

	protected Order()
	{
	}

	public Order(double weight, Destination destination)
	{
		this.weight = weight;
		this.destination = Objects.requireNonNull(destination, "Destination must not be null");
	}

	public Long getId()
	{
		return id;
	}

	public double getWeight()
	{
		return weight;
	}

	public Destination getDestination()
	{
		return destination;
	}
}
