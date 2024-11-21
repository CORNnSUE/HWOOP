package Lab2;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        System.out.println("The equipvalent hexidecimal number is: " + Integer.toHexString(decimal));
        scanner.nextLine();
        scanner.nextLine();
    }
}
