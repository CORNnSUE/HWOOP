package Lab4;

import java.util.Scanner;

public class FactorialRecursive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Factorial of 6 is " + factorial(6));
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
