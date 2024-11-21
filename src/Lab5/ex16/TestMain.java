package ex16;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Account account1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(account1);

        Account account2 = new Account("A101", "Kumar");
        System.out.println(account2);

        System.out.println("Id: " + account1.getId());
        System.out.println("Name: " + account1.getName());
        System.out.println("Balance: " + account1.getBalance());

        account1.credit(100);
        System.out.println(account1);
        account1.debit(50);
        System.out.println(account1);
        account1.debit(500);
        System.out.println(account1);

        account1.transferTo(account2, 100);
        System.out.println(account1);
        System.out.println(account2);
    }
}

