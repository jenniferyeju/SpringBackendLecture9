package org.example.Head03_OOP.example08;

public class OrderService {

    public void processPayment(Payment payment, double amount) {
        payment.pay(amount); // 다형성 핵심
    }
}
