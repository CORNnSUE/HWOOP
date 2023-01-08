package ex15;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        InvoiceItem invoiceItem = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(invoiceItem);

        invoiceItem.setQty(900);
        invoiceItem.setUnitPrice(0.99);
        System.out.println(invoiceItem);

        System.out.println("id is: " + invoiceItem.getId());
        System.out.println("description is: " + invoiceItem.getDesc());
        System.out.println("quantity is: " + invoiceItem.getQty());
        System.out.println("unit price is: " + invoiceItem.getUnitPrice());

        System.out.println("The total is: " + invoiceItem.getTotal());


    }
}

