package HW1.bai1;

import java.util.Scanner;

public class CheckerPattern {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the size: ");
      int size = scanner.nextInt();

      if (size > 0) {
         for (int row = 1; row <= size; row++) {
            System.out.print("\t");
            if (row % 2 == 0) {
               System.out.print(" ");
            }
            for (int column = 1; column <= size; column++) {
               System.out.print("# ");
            }
            System.out.println();
         }
      } else {
         System.out.println("Invalid size!!!");
      }
   }
}
