package com.example.ecommerce.Repo;

import com.example.ecommerce.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface OrderRepository extends JpaRepository<Order, Serializable> {
    // Custom query methods can be added here if needed
}