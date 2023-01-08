import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numberOfItem = scanner.nextInt();

        int itemArray[] = new int[numberOfItem];

        System.out.print("Enter the value of all items : ");
        for (int i = 0; i < itemArray.length; i++) {
            itemArray[i] = scanner.nextInt();
        }

        System.out.print("The values are: [");
        for (int i = 0; i < itemArray.length; i++) {
            if (i != itemArray.length - 1) {
                System.out.print(itemArray[i] + ", ");
            } else {
                System.out.print(itemArray[i]);
            }
        }
        System.out.println("]");
    }
}
