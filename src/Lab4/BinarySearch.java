package Lab4;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int arr[] = { 11, 14 ,16 ,18, 20, 25, 28, 30, 34, 40, 45 };
        int key = 18;
        int valueReturn = usingBinarySearch(arr, key);

        if (valueReturn != -1) {
            System.out.println(key + " is found in this array at " + valueReturn);
        } else {
            System.out.println(key + " is not found in this array.");
        }

    }

    public static int usingBinarySearch(int arr[], int key) {

        if (arr == null) {
            return -1;
        }

        int first = 0;
        int last = arr.length;
        int middle = (first + last) / 2;

        while (first <= last) {
            if (arr[middle] < key) {
                first = middle + 1;
            } else if (arr[middle] > key) {
                last = middle - 1;
            } else {
                return middle;
            }
            middle = (first + last) / 2;
        }

        return -1;
    }

}
