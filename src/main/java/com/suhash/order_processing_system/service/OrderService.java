package com.suhash.order_processing_system.service;

import com.suhash.order_processing_system.exception.OrderNotFoundException;
import com.suhash.order_processing_system.model.Order;
import com.suhash.order_processing_system.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    // 1. Create New Order
    public Order createOrder(Order order) {
        order.setStatus("PENDING");
        order.setOrderDate(LocalDateTime.now());
        return orderRepository.save(order);
    }

    // 2. Get All Orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // 3. Get Order By ID
    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new OrderNotFoundException("Order not found with id: " + id));
    }

    // 4. Update Order Status (e.g., PENDING -> SHIPPED)
    public Order updateOrderStatus(Long id, String status) {
        Order order = getOrderById(id);
        order.setStatus(status);
        return orderRepository.save(order);
    }

    // 5. Delete Order By ID
    public void deleteOrder(Long id) {
        Order order = getOrderById(id);
        orderRepository.delete(order);
    }

    // 6. Custom Search by Customer Name
    public List<Order> searchByCustomerName(String customerName) {
        return orderRepository.findByCustomerNameContainingIgnoreCase(customerName);
    }
}