import java.util.Scanner;

public class ExchangeCipher {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      exchangeCipherRule(scanner);
   }
   public static void exchangeCipherRule(Scanner scanner) {
      System.out.print("Enter the message to encode: ");
      final int keyNumber = (int) 'M';
      String password = scanner.nextLine();
      password = password.toUpperCase();
      System.out.print("Decoding: ");
      for (int i = 0; i < password.length(); i++) {
         int numberOfText = (int) password.charAt(i);
         if (numberOfText > keyNumber) {
            System.out.print((char) (keyNumber - (numberOfText - keyNumber) + 1));
         } else {
            System.out.print((char) (keyNumber + (keyNumber - numberOfText) + 1));
         }

      }
   }
}
