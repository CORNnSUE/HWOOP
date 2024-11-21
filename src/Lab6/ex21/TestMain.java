package Lab6.ex21;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Choose a test:");
            System.out.println("1. Test line");
            System.out.println("2. Test linesub");
            System.out.println("3. Test point");
            System.out.print("Choice: ");

            int choice = Integer.parseInt(scanner.nextLine());

            while (choice < 1 || choice > 3) {
                System.out.println("Invalid!");
                System.out.print("Choose from 1-3: ");
                choice = Integer.parseInt(scanner.nextLine());
            }

            switch (choice) {
                case 1:
                    TestLine.main(args);
                    break;
                case 2:
                    TestLineSub.main(args);
                    break;
                case 3:
                    TestPoint.main(args);
                    break;
                default:
            }

    }
}

