package Lab1;

import java.util.Scanner;
public class ReverseInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a postive integer: ");
        int inNumber = scanner.nextInt();
        int inDigit;
        System.out.print("The reverse is: ");
        while (inNumber > 0) {
            inDigit = inNumber % 10;
            System.out.print(inDigit);
            inNumber /= 10;
        }
    }
}
