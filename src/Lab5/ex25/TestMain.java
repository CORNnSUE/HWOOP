package ex25;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Customer customer = new Customer(180, "Nghia", 'm');
        System.out.println(customer);

        Account account = new Account(2002, customer, 100.0);
        System.out.println(account);

        account.setBalance(150.5);
        System.out.println(account);

        account.deposit(50);
        System.out.println("After deposit: ");
        System.out.println(account);

        account.withdraw(100);
        System.out.println("After withdraw: ");
        System.out.println(account);

    }

}

