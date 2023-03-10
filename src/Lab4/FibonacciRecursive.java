package Lab4;

import java.util.Scanner;

public class FibonacciRecursive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("The " + 10 +"th " + "Fibonacci number is : "+ fibonacci(10));

    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
