package com.gabrieldm.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrieldm.course.entities.OrderItem;
import com.gabrieldm.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
