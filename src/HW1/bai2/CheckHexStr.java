import java.util.Scanner;

public class CheckHexStr {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      checkHexString(scanner);
   }

   public static void checkHexString(Scanner scanner) {
      System.out.print("Enter a string: ");
      String text = scanner.nextLine();
      text = text.toLowerCase();
      boolean k = true;
      for (int index = 0; index < text.length(); index++) {
         if (!(text.charAt(index) >= '0' && text.charAt(index) <= '9'
               || text.charAt(index) >= 'a' && text.charAt(index) <= 'f')) {
            k = false;
            break;
         }
      }
      if (k) {
         System.out.println("\"" + text + "\" is a hex String");

      } else {
         System.out.println("\"" + text + "\" is not a hex String");

      }
   }
}
