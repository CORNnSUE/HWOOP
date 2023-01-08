import java.util.Scanner;

public class FibonacciInt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("tryFibonacci:");

        int num = 0;
        int fibonacci = calFibonacci(num);

        System.out.println("F(" + num + ") = " + fibonacci);

        while (calFibonacci(num) > 0) {

            num++;
            fibonacci = calFibonacci(num);

            if (fibonacci > 0) {
                System.out.println("F(" + num + ") = " + fibonacci);

            } else {
                System.out.println("F(" + num + ") is out of integer ");

            }

        }

        System.out.println("tryTriibonacci:");

        num = 0;
        int tribonacci = calTribonacci(num);

        System.out.println("F(" + num + ") = " + tribonacci);

        while (calTribonacci(num) > 0) {

            num++;
            tribonacci = calTribonacci(num);

            if (tribonacci > 0) {
                System.out.println("F(" + num + ") = " + tribonacci);

            } else {
                System.out.println("F(" + num + ") is out of integer ");

            }

        }
    }

    public static int calFibonacci(int numTerm) {

        if (numTerm >= 0) {

            if (numTerm == 0) {
                return 1;

            } else if (numTerm == 1) {
                return 1;

            } else {

                int fDad = 1;
                int fSon = 1;
                int fibo = 0;

                for (int i = 2; i <= numTerm; i++) {
                    fibo = fDad + fSon;
                    fDad = fSon;
                    fSon = fibo;
                }

                return fibo;
            }
        }
        return -1;
    }

    public static int calTribonacci(int numTerm) {

        if (numTerm >= 0) {

            if (numTerm == 0) {
                return 1;

            } else if (numTerm == 1) {
                return 1;

            } else if (numTerm == 2) {
                return 2;

            } else {

                int fGrandpa = 1;
                int fDad = 1;
                int fSon = 2;
                int fibo = 0;

                for (int i = 3; i <= numTerm; i++) {
                    fibo = fGrandpa + fDad + fSon;
                    fGrandpa = fDad;
                    fDad = fSon;
                    fSon = fibo;
                }

                return fibo;
            }
        }
        return -1;
    }
}
