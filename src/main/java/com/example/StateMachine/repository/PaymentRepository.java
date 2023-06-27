package com.example.StateMachine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StateMachine.domain.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    
}
