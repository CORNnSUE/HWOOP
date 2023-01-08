package Lab2;

import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numberOfItem = scanner.nextInt();

        int itemArray[] = new int[numberOfItem];

        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < itemArray.length; i++) {
            itemArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < itemArray.length; i++) {
            System.out.print(itemArray[i] + ":  ");
            for (int numberOfStars = 0; numberOfStars < itemArray[i]; numberOfStars++) {
                System.out.print("*");
            }
            System.out.println("(" + itemArray[i] + ")");
        }
    }
}
