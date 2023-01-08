package HW1.bai1;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        if (size > 0) {

            System.out.printf("%2s |", "*");

            for (int i = 1; i <= size; i++) {
                System.out.printf("%4d", i);
            }
            System.out.println();
            for (int j = 0; j <= size; j++) {
                System.out.print("----");

            }
            System.out.println(); 
            for (int row = 1; row <= size; row++) {
                System.out.printf("%2d |", row);
                for (int col = 1; col <= size; col++) {
                    System.out.printf("%4d", (col * row));

                }
                System.out.println(); // to the nextline after ending the row above

            }

        } else {
            System.out.println("Invalid input!!!");
        }
    }

}
