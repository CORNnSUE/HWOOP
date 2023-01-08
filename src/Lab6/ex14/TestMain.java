package Lab6.ex14;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Shape shape[] = new Shape[3];
        int choice;

        for (int i = 0; i < shape.length; i++) {
            System.out.println("Choose the shape number " + (i + 1));
            System.out.println("1: Circle ");
            System.out.println("2: Rectangle ");
            System.out.println("3: Square ");

            choice = scanner.nextInt();
            while (choice < 1 || choice > 3) {
                System.out.println("Invalid choice, try again!");
                choice = scanner.nextInt();
            }
            scanner.nextLine();

            switch (choice) {
                case 1:
                    shape[i] = new Circle(i + 1);
                    break;
                case 2:
                    shape[i] = new Rectangle(i + 1, i + 2);
                    break;
                default:
                    shape[i] = new Square(i + 1);
            }

        }

        for (Shape eachShape : shape) {
            if (eachShape instanceof Circle) {
                System.out.println((Circle) eachShape);
            } else if (eachShape instanceof Rectangle) {
                System.out.println((Rectangle) eachShape);
            } else {
                System.out.println((Square) eachShape);
            }
        }
    }
}



