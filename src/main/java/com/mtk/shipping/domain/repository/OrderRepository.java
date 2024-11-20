package com.mtk.shipping.domain.repository;

import com.mtk.shipping.domain.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>
{
}