package HW1.bai1;

import java.util.Scanner;

public class BoxPattern {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        if (size > 0) {
            System.out.println("A\n");
            printBoxPatternA(size);
            System.out.println("\nB\n");
            printBoxPatternB(size);
            System.out.println("\nC\n");
            printBoxPatternC(size);
            System.out.println("\nD\n");
            printBoxPatternD(size);
        } else {
            System.out.println("Invalid input!!!");
        }
    }
    private static void printBoxPatternA(int size) {

        for (int row = 1; row < size; row++) {
            for (int column = 1; column < size; column++) {
                if (row == 1 || row == size - 1) {
                    System.out.print("# ");
                } else if (column == 1 || column == size - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void printBoxPatternB(int size) {

        for (int row = 1; row < size; row++) {
            for (int column = 1; column < size; column++) {
                if (row == 1 || row == size - 1) {
                    System.out.print("# ");
                } else if (column == row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void printBoxPatternC(int size) {

        for (int row = 1; row < size; row++) {
            for (int column = 1; column < size; column++) {
                if (row == 1 || row == size - 1) {
                    System.out.print("# ");
                } else if (column == size - row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void printBoxPatternD(int size) {
        for (int row = 1; row < size; row++) {
            for (int column = 1; column < size; column++) {
                if (row == 1 || row == size - 1) {
                    System.out.print("# ");
                } else if (column == size - row || column == row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
