package com.springjpa.springdatajpa.repository;

import com.springjpa.springdatajpa.entity.Product;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Product, Integer> {
}
