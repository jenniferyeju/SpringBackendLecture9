package org.example.Heda03_OOP;

class Order {
    String customerName;
    String product;
    int quantity;
    int price;

    Order(String customerName, String product, int quantity, int price) {
        this.customerName = customerName;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    int getTotalPrice() {
        return quantity * price;
    }

    void printOrderSummary() {
        System.out.printf("%s 님이 주문한 %s %d권의 총액은 %d원입니다.\n", customerName, product, quantity, getTotalPrice());
    }
}
public class OOPOrderManager {
    public static void main(String[] arge) {
        Order order = new Order("Alice", "Book", 2, 15000);
        order.printOrderSummary();
       Order order1 = new Order("정예주", "볼펜", 3, 2000);
        order1.printOrderSummary();
    }
}
