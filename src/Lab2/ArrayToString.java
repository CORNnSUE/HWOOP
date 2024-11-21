import java.util.Scanner;

public class ArrayToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");

        int numberofArr = scanner.nextInt();
        int array[] = new int[numberofArr];

        String stringToArr = arrayToString(scanner, array);
        System.out.println("The values are: " + stringToArr);
    }

    public static String arrayToString(Scanner scanner, int array[]) {

        if (array == null) {
            return "Null Array!!!!";
        }

        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        String stringOfArr = "[";
        for (int index = 0; index < array.length; index++) {
            if (index != array.length - 1)
                stringOfArr += array[index] + ", ";
            else
                stringOfArr += array[index];

        }
        stringOfArr += "]";
        return stringOfArr;
        //can use for each to try this ex
        // for(int element : array) { (for each )
        // use trim() to delete the blank


    }
}
