package ex24;


import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Customer customer = new Customer(98, "An", 10);
        System.out.println(customer);
        customer.setDiscount(8);
        System.out.println(customer);
        System.out.println("id is: " + customer.getId());
        System.out.println("name is " + customer.getName());
        System.out.println("discount is "+ customer.getDiscount());


        Invoice invoice = new Invoice(101, customer, 888.8);
        System.out.println(invoice);
        invoice.setAmount(999.9);
        System.out.println(invoice);
        System.out.println("id is: " + invoice.getId());
        System.out.println("Customer is: " + invoice.getCustomer());
        System.out.println("Amount is: " + invoice.getAmount());
        System.out.println("Customer's ID is " + invoice.getCustomerId());
        System.out.println("Customer's name is " + invoice.getCustomerName());
        System.out.println("Customer's discount is: " + invoice.getCustomerDiscount());
        System.out.printf("Amount after discount: %.2f%n", invoice.amountAfterDiscount());

    }
}

