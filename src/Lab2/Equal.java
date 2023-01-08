package Lab2;

import java.util.Scanner;

public class Equal {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter the number of items in array 1: ");
         int numberOfArr = scanner.nextInt();
         int array[] = new int[numberOfArr];

         System.out.print("Enter the value of all items : ");
         for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
         }

         System.out.print("Enter the number of items in array 2: ");
         int numberOfArr2 = scanner.nextInt();
         int array2[] = new int[numberOfArr2];

         System.out.print("Enter the value of all items : ");
         for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
         }

         if (isEqual(array, array2)) {
            System.out.println("2 array are equal!!!");
         } else {
            System.out.println("2 array are not equal!!!");

         }
      }

   public static boolean isEqual(int arr1[], int arr2[]) {
      if (arr1 == null || arr2 == null) {
         System.out.println("Null array!!!!!");
         return false;
      }
      if (arr1.length == arr2.length) {
         for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
               return false;
            }
         }
         return true;
      }
      return false;
   }
}
