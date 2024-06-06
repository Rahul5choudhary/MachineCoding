package com.example.practice.SolidPrinciple.singleResponsibiltyPrinciple;

public class InvoiceGenerator {
    public static void main(String[] args) {
        printInvoice();
    }

    private static void printInvoice(){
        Marker marker = new Marker(10,"Red");
        Invoice invoice = new Invoice(marker,10);
        System.out.println("Total price : " + invoice.calculatePrice());
    }


}
