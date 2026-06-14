package org.example;

public class PaymentFactory {
    Payment getPayment(String type) {
        if("UPI".equalsIgnoreCase(type)) {
            return new UPIPayment();
        } else if("NetBanking".equalsIgnoreCase(type)) {
            return new BankPayment();
        } else if("Card".equalsIgnoreCase(type)) {
            return new CardPayment();
        }
        return (Payment) new IllegalArgumentException("Invalid payment type: " + type);
    }
}
