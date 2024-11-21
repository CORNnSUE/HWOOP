package Lab4;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arr[] = { 9, 6, 4 ,1 ,5 ,2 ,7 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        usingInsertionSort(arr);

        System.out.println("\nResult after using insertion sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void usingInsertionSort(int arr[]) {

        if (arr == null) {
            return;
        }

        int temp;
        int n;

        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            n = i - 1;
            while ((n > -1) && (arr[n] > temp)) {
                arr[n + 1] = arr[n];
                n--;
            }
            arr[n + 1] = temp;
        }
    }

}
