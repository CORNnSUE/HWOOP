package HW1.bai1;

import java.util.Scanner;
public class HillPattern {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the size: ");
      int size = scanner.nextInt();

      if (size > 0) {
         System.out.println("A\n");
         printHillPatternA(size);
         System.out.println("\nB\n");
         printHillPatternB(size);
         System.out.println("\nC\n");
         printHillPatternC(size);
         System.out.println("\nD\n");
         printHillPatternD(size);
      } else {
         System.out.println("Invalid input!!!");
      }
   }

   private static void printHillPatternA(int size) {
      int dis = 0;
      for (int row = 1; row <= size; row++) {
         for (int column = 1; column <= (2 * size) - 1; column++) {
            if (column <= size + dis && column >= size - dis) {
               System.out.print("# ");
            } else {
               System.out.print("  ");
            }
         }
         dis++;
         System.out.println();
      }

   }

   private static void printHillPatternB(int size) {
      int dis = size - 1;
      for (int row = 1; row <= size; row++) {
         for (int column = 1; column <= (2 * size) - 1; column++) {
            if (column <= size + dis && column >= size - dis) {
               System.out.print("# ");
            } else {
               System.out.print("  ");
            }
         }
         dis--;
         System.out.println(); 
      }
   }

   private static void printHillPatternC(int size) {
      int dis = 0;
      for (int row = 1; row <= (2 * size) - 1; row++) {
         if (row <= size) {
            for (int column = 1; column <= (2 * size) - 1; column++) {
               if (column <= size + dis && column >= size - dis) {
                  System.out.print("# ");
               } else {
                  System.out.print("  ");
               }
            }
            dis++;
         } else {
            dis--; 
            for (int column = 1; column <= (2 * size) - 1; column++) {
               if (column <= size + dis - 1 && column >= size - dis + 1) {
                  System.out.print("# ");
               } else {
                  System.out.print("  ");
               }
            }

         }

         System.out.println(); 
      }
   }

   private static void printHillPatternD(int size) {
      int dis = 0;
      for (int row = 1; row <= (2 * size); row++) {
         if (row <= size) {
            for (int column = 1; column <= (2 * size) - 1; column++) {
               if (column < size + dis && column > size - dis) {
                  System.out.print("  ");
               } else {
                  System.out.print("# ");
               }
            }
            dis++;
         } else {
            dis--;
            for (int column = 1; column <= (2 * size) - 1; column++) {
               if (column <= size + dis - 1 && column >= size - dis + 1) {
                  System.out.print("  ");
               } else {
                  System.out.print("# ");
               }
            }

         }

         System.out.println();
      }
   }
}
