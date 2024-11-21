package HW1.bai2;

import java.util.Scanner;

public class DecipherCaesarCode {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      deCeasarCode(scanner);
   }
   public static void deCeasarCode(Scanner scanner) {
      System.out.print("Enter sequence of Ceasar code: ");
      String password = scanner.nextLine();
      password = password.toUpperCase();
      System.out.print("Decoding: ");
      for (int i = 0; i < password.length(); i++) {
         if (password.charAt(i) == 'A') {
            System.out.print('X');
         } else if (password.charAt(i) == 'B') {
            System.out.print('Y');
         } else if (password.charAt(i) == 'C') {
            System.out.print('Y');
         } else {
            int numberOfText = (int) password.charAt(i) - 3;
            System.out.print((char) numberOfText);
         }

      }

   }
}
