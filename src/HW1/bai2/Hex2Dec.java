import java.util.Scanner;

public class Hex2Dec {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      convertHexToDecimal(scanner);
   }

   public static void convertHexToDecimal(Scanner scanner) {
      System.out.print("Enter a hexical string: ");
      String text = scanner.nextLine();
      boolean k = true;
      for (int index = 0; index < text.length(); index++) {
         if (!(text.charAt(index) >= '0' && text.charAt(index) <= '9'
               || text.charAt(index) >= 'a' && text.charAt(index) <= 'f')) {
            k = false;
            break;
         }
      }
      if (k) {
         int decimal = Integer.parseInt(text, 16);
         System.out.println("The equivalent decimal number of hexical \"" + text + "\" is: " + decimal);

      } else {
         System.out.println("\"" + text + "\" is not a hex String");

      }
   }
}
