import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items in array 1: ");
        int numberofArr = scanner.nextInt();
        int array[] = new int[numberofArr];

        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        array = reverseArray(array);

        System.out.println("After reversing: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] reverseArray(int arr[]) {
        if (arr == null) {
            System.out.println("Null Array");
            int array[] = new int[1];
            array[0] = -1;
            return array;
        }
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}
