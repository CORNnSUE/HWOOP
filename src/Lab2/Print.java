import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Integer type
        System.out.print("Enter the number of items ");
        int numberofArr = scanner.nextInt();
        int array[] = new int[numberofArr];
        print(scanner, array);

        // Double type
        System.out.print("Enter the number of items : ");
        int numberOfArr2 = scanner.nextInt();
        double array2[] = new double[numberOfArr2];
        print(scanner, array2);

        // Float type
        System.out.print("Enter the number of items : ");
        int numberOfArr3 = scanner.nextInt();
        float array3[] = new float[numberOfArr3];
        print(scanner, array3);
    }

    public static void print(Scanner scanner, int array[]) {

        if (array == null) {
            return;
        }

        System.out.print("Enter the value of all items : ");
        for (int index = 0; index < array.length; index++) {
            array[index] = scanner.nextInt();
        }

        System.out.print("The values are: [");
        for (int index = 0; index < array.length; index++) {
            if (index != array.length - 1)
                System.out.print(array[index] + ", ");
            else
                System.out.print(array[index]);
        }
        System.out.println("]");
    }

    public static void print(Scanner scanner, double array[]) {

        if (array == null) {
            return;
        }

        System.out.print("Enter the value of all items : ");
        for (int index = 0; index < array.length; index++) {
            array[index] = scanner.nextDouble();
        }

        System.out.print("The values are: [");
        for (int index = 0; index < array.length; index++) {
            if (index != array.length - 1)
                System.out.print(array[index] + ", ");
            else
                System.out.print(array[index]);
        }
        System.out.println("]");
    }

    public static void print(Scanner scanner, float array[]) {

        if (array == null) {
            return;
        }

        System.out.print("Enter the value of all items : ");
        for (int index = 0; index < array.length; index++) {
            array[index] = scanner.nextFloat();
        }

        System.out.print("The values are: [");
        for (int index = 0; index < array.length; index++) {
            if (index != array.length - 1)
                System.out.print(array[index] + ", ");
            else
                System.out.print(array[index]);
        }
        System.out.println("]");
    }

}
