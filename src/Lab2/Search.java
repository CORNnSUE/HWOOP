import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items in array: ");
        int numberofArr = scanner.nextInt();
        int array[] = new int[numberofArr];
        System.out.print("Enter the value of all items : ");
        for (int index = 0; index < array.length; index++) {
            array[index] = scanner.nextInt();
        }

        System.out.print("Enter the number you want to find: ");
        int keyValue = scanner.nextInt();
        if (search(array, keyValue) != -1) {
            System.out.println(keyValue + " contains in this array");
        } else {
            System.out.println(keyValue + " does not contains in this array");
        }
    }

    public static int search(int arr[], int key) {
        if (arr == null) {
            System.out.println("Null array!!!!!");
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (key == arr[index]) {
                return key;
            }
        }
        return -1;
    }
}
