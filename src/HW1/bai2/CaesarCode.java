package HW1.bai2;

import java.util.Scanner;

public class CaesarCode {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      enCeasarCode(scanner);
   }

   public static void enCeasarCode(Scanner scanner) {
      System.out.print("Enter the message ");
      String password = scanner.nextLine();
      password = password.toUpperCase();
      System.out.print("The Ceacar code is: ");
      for (int i = 0; i < password.length(); i++) {
         if (password.charAt(i) == 'X') {
            System.out.print('A');
         } else if (password.charAt(i) == 'Y') {
            System.out.print('B');
         } else if (password.charAt(i) == 'Z') {
            System.out.print('C');
         } else {
            int numberOfText = (int) password.charAt(i) + 3;
            System.out.print((char) numberOfText);
         }
      }
   }
}
