package org.example.Heda03_OOP.example11;

import javax.naming.directory.ModificationItem;

public class PaymentProcessorTest {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        Payment[] payments = new Payment[]{
                new AccountTransferPayment(),
                new CreditCardPayment(),
                new MobilePayment()
        };
        double[] paymentAmount = new double[] {
                500,2000,1050
        };
        int index = 0;
        for (Payment payment : payments) {
            paymentProcessor.pay(payment, paymentAmount[index++]);
        }
    }
}
