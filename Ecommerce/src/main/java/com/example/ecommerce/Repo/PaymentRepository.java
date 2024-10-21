package com.example.ecommerce.Repo;

import com.example.ecommerce.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Serializable> {
}