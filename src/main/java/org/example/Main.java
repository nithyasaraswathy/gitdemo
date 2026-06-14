package org.example;


public class Main {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();
         String type= "netbanking";
         Payment payment = paymentFactory.getPayment(type);
         payment.pay();

    }
}