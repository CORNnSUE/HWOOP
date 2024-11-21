package Lab6.ex15;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Mammal mammal[] = new Mammal[1];
        int choice;

        for (int i = 0; i < mammal.length; i++) {
            System.out.println("Choose the mammal number " + (i + 1));
            System.out.println("1: Dog");
            System.out.println("2: Cat");

            choice = scanner.nextInt();
            while (choice < 1 || choice > 2) {
                System.out.println("Invalid! try again");
                choice = scanner.nextInt();
            }
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                mammal[i] = new Dog(name);
            } else {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                mammal[i] = new Cat(name);
            }

        }

        for (Mammal eachMammal : mammal) {
            if (eachMammal instanceof Dog) {
                System.out.println((Dog) eachMammal);

            } else {
                System.out.println((Cat) eachMammal);

            }
        }
    }
}

