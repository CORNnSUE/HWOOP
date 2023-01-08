package Lab1;

import java.util.Scanner;
public class SumProductMinMax3 {
	
    public static void main (String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st : ");
        int number1 = sc.nextInt();
        System.out.print("Enter 2nd : ");
        int number2 = sc.nextInt();
        System.out.print("Enter 3rd : ");
        int number3 = sc.nextInt();
        
        int sum = number1 + number2 + number3;
        System.out.println("The sum is: " + sum);
        int product = number1*number2*number3;
        System.out.println("The product is: " + product);


        int min_3numbers = number1;
        if (number2 < min_3numbers) {
            min_3numbers = number2;
        }
        if (number3 < min_3numbers) {
            min_3numbers = number3;
        }
        System.out.println("The min is: " + min_3numbers);

        int max_3numbers = number2;
        if (number1 > max_3numbers) {
            max_3numbers = number1;
        }
        if ( number3 > max_3numbers) {
            max_3numbers = number3;
        }
        System.out.println("The max is: "+ max_3numbers);

    }

}
