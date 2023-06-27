package com.example.StateMachine.services;

import org.springframework.statemachine.StateMachine;

import com.example.StateMachine.domain.Payment;
import com.example.StateMachine.domain.PaymentEvent;
import com.example.StateMachine.domain.PaymentState;

public interface PaymentService {
    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);

}
