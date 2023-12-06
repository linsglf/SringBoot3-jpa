package com.cursojava.spring.repositories;

import com.cursojava.spring.entities.Category;
import com.cursojava.spring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
