package HW3;

import java.util.Scanner;

public class SystemConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String in = scanner.nextLine();

        System.out.print("Enter the input radix: ");
        int inRadix = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the output radix: ");
        int outRadix = scanner.nextInt();
        scanner.nextLine();

        System.out.println(in + " in radix " + inRadix + " is " + toRadix(in, inRadix, outRadix) + " in radix " + outRadix);
    }

    public static String toRadix(String in, int inRadix, int outRadix) {

        int num = Integer.parseInt(in, inRadix);
        return Integer.toString(num, outRadix);
    }
}
