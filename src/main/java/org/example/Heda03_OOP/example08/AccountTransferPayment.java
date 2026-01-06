package org.example.Heda03_OOP.example08;

public class AccountTransferPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("계좌이체로 " + amount + "원 결제했습니다.");
    }
}