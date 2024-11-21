import java.util.Scanner;

public class Contain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items in array: ");
        int numberofArr = scanner.nextInt();
        int array[] = new int[numberofArr];

        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the number you want to find: ");
        int keyNumber = scanner.nextInt();
        if (isContain(array, keyNumber)) {
            System.out.println(keyNumber + " contains in this array");
        } else {
            System.out.println(keyNumber + " does not contains in this array");
        }
    }

    public static boolean isContain(int arr[], int key) {
        if (arr == null) {
            System.out.println("Null array!!!");
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return true;
            }
        }
        return false;
    }
}
