package HW1.bai2;

import java.util.Scanner;

public class ReverseString {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      reverseString(scanner);
   }

   public static void reverseString(Scanner scanner) {
      System.out.print("Enter a string: ");
      String text = scanner.nextLine();
      System.out.print("The reverse of string " + text + " is: ");

      for (int index = text.length() - 1; index >= 0; index--) {
         System.out.print(text.charAt(index));
      }
   }
}
