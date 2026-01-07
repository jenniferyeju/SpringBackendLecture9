package org.example.Head03_OOP.example08;

public class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("신용카드로 " + amount + "원 결제했습니다.");
    }
}
