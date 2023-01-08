package Lab4;

import java.util.Scanner;

public class GCDRecursive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = 110;
        int num2 = 80;

        System.out.println("GCD of " + num1 + " and " + num2 + " is: ");
        System.out.println(findGCD(num1, num2));

    }

    public static int findGCD(int num1, int num2) {

        if (num2 != 0) {
            return findGCD(num2, num1 % num2);
        }

        return num1;
    }

}
