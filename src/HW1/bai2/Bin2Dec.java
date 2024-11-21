import java.util.Scanner;

public class Bin2Dec {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      convertBinToDecimal(scanner);
   }

   public static void convertBinToDecimal(Scanner scanner) {
      System.out.print("Enter a Binary string: ");
      String text = scanner.nextLine();
      boolean k = true;
      for (int index = 0; index < text.length(); index++) {
         if (text.charAt(index) != '0' && text.charAt(index) != '1') {
            k = false;
            break;
         }
      }
      if (k) {
         int decimal = Integer.parseInt(text, 2);
         System.out.println("The equivalent decimal number of binary \"" + text + "\" is: " + decimal);
      } else {

         System.out.println("\"" + text + "\" invalid binary string");
      }
   }
}
