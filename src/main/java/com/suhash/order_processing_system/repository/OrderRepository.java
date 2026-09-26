package com.suhash.order_processing_system.repository;

import com.suhash.order_processing_system.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByCustomerNameContainingIgnoreCase(String customerName);
}