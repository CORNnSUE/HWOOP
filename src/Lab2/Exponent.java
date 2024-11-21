package Lab2;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = scanner.nextInt();
        System.out.print(base + " raise to the power of " + exp + " is: " +
                exponent(base, exp));
        System.out.println();
    }

    public static int exponent(int base, int exp) {
        int product = 1;
        for (int i = 1; i <= exp; i++) {
            product *= base;
        }
        return product;
    }
}
