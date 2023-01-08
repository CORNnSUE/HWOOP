package HW1.bai2;

import java.util.Scanner;

public class Oct2Dec {
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      convertOctToDecimal(scanner);
   }

   public static void convertOctToDecimal(Scanner scanner) {
      System.out.print("Enter a oct string: ");
      String text = scanner.nextLine();
      boolean k = true;
      for (int index = 0; index < text.length(); index++) {
         if (!(text.charAt(index) >= '0' && text.charAt(index) <= '7')) {
            k = false;
            break;
         }
      }
      if (k) {
         int decimal = Integer.parseInt(text, 8);
         System.out.println("The equivalent decimal number of OCT \"" + text + "\" is: " + decimal);

      } else {
         System.out.println("\"" + text + "\" is not a OCT String");

      }
   }
}
