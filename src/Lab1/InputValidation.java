package Lab1;

import java.util.Scanner;
public class InputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        
        do{
            System.out.print("Enter a number between 0-10 or 9-100: ");
            int numberIn = scanner.nextInt();
            if (0 <= numberIn && numberIn <= 10 || 90 <= numberIn && numberIn <= 100) {
                System.out.println("You have entered: " + numberIn);
                isValid = true;
            }else {
                System.out.println("Invalid input, try again...");
                } 
            }while (!isValid);
    }
}


