import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items in array 1: ");
        int numberofArr = scanner.nextInt();
        int array[] = new int[numberofArr];

        System.out.print("Enter the value of all items : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of items in array 2: ");
        int numberOfArr11 = scanner.nextInt();
        int array2[] = new int[numberOfArr11];
        System.out.print("Enter the value of all items : ");

        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }
        boolean canSwap = swap(array, array2);

        if (canSwap) {
            int tempArr[] = array;
            array = array2;
            array2 = tempArr;
            System.out.println("After swap");
            System.out.println("Array 1: ");

            for (int index = 0; index < array.length; index++) {
                System.out.print(array[index] + " ");
            }
            System.out.println("\nArray 2: ");

            for (int index = 0; index < array2.length; index++) {
                System.out.print(array2[index] + " ");
            }
        } else {
            System.out.println("Can not swap !!");
        }
    }

    public static boolean swap(int arr1[], int arr2[]) {
        if (arr1 == null || arr2 == null) {
            System.out.println("Null array!!!!");
            return false;
        }
        if (arr1.length == arr2.length) {
            return true;
        }
        return false;
    }
}
