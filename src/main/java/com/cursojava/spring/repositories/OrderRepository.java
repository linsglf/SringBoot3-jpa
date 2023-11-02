package com.cursojava.spring.repositories;

import com.cursojava.spring.entities.Order;
import com.cursojava.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
