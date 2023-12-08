package com.cursojava.spring.repositories;

import com.cursojava.spring.entities.OrderItem;
import com.cursojava.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
