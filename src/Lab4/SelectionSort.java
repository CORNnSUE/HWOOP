import java.util.Scanner;

public class SelectionSort {

    public static void main(String a[]) {

        Scanner scanner = new Scanner(System.in);
        int arr[] = { 9, 6, 4, 1, 5 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        usingSelectionSort(arr);

        System.out.println("\nResult after using selection sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void usingSelectionSort(int[] arr) {

        if (arr == null) {
            return;
        }

        int n;
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            n = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[n]) {
                    n = j;
                }
            }

            temp = arr[n];
            arr[n] = arr[i];
            arr[i] = temp;
        }
    }

}