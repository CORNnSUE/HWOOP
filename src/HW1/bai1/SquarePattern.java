import java.util.Scanner;

public class SquarePattern {
   public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   /*
   static void UsingForLoop(Scanner scanner){
   //using for loop
      System.out.print("Enter the size: ");
      int size = scanner.nextInt();
      if (size > 0) {
         for (int row = 1; row <= size; row++) {
            System.out.print("\t"); // The square in the centre   
            for (int col = 1; col <= size; col++) {
               System.out.print("# ");
            }
            System.out.println();
         }
      } else {
         System.out.println("Invalid size!!!");
      }
   }
*/
   // Using while loop
       System.out.print("Enter the size: ");
       int size = scanner.nextInt();

      if (size > 0) {
         int Col;
         int Row = 1;

         while (Row <= size) {
            Col = 1;
            System.out.print("\t"); // The square in the centre 
            while (Col <= size) {
               System.out.print("# ");
               Col++;
            }
            System.out.println(); 
            Row++;
         }
      } else {
         System.out.println("Invalid size!!!");
      }

   }
}
