package com.suhash.order_processing_system.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import java.time.LocalDateTime;

    @Entity
    @Table(name = "customer_orders")
    public class Order {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotBlank(message = "Customer name is required")
        private String customerName;

        @NotBlank(message = "Product name is required")
        private String productName;

        @Positive(message = "Quantity must be greater than zero")
        private int quantity;

        @Positive(message = "Price must be positive")
        private double price;

        private String status; // PENDING, PROCESSING, COMPLETED, CANCELLED

        private LocalDateTime orderDate;

        public Order() {
            this.orderDate = LocalDateTime.now();
            this.status = "PENDING";
        }

        public Order(String customerName, String productName, int quantity, double price) {
            this();
            this.customerName = customerName;
            this.productName = productName;
            this.quantity = quantity;
            this.price = price;
        }

        // Getters and Setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getCustomerName() { return customerName; }
        public void setCustomerName(String customerName) { this.customerName = customerName; }

        public String getProductName() { return productName; }
        public void setProductName(String productName) { this.productName = productName; }

        public int getQuantity() { return quantity; }
        public void setQuantity(int quantity) { this.quantity = quantity; }

        public double getPrice() { return price; }
        public void setPrice(double price) { this.price = price; }

        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }

        public LocalDateTime getOrderDate() { return orderDate; }
        public void setOrderDate(LocalDateTime orderDate) { this.orderDate = orderDate; }
    }

