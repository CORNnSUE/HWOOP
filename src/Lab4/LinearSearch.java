import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 5;
        int valueReturn = usingLinearSearch(arr, key);

        if (valueReturn != -1) {
            System.out.println(key + " is found in this array at " + valueReturn);
        } else {
            System.out.println(key + " is not found in this array");
        }

    }

    public static int usingLinearSearch(int arr[], int key) {

        if (arr == null) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

}
