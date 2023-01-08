import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arr[] = { 9, 2, 4, 1, 5 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        usingBubbleSort(arr);

        System.out.println("\nResult after using bubble sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void usingBubbleSort(int[] arr) {

        if (arr == null) {
            return;
        }

        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }


}