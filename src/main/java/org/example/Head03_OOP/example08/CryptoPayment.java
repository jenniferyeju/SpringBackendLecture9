package org.example.Head03_OOP.example08;

public class CryptoPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("암호화폐로 " + amount + "원 결제했습니다.");
    }
}
