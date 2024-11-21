import java.util.Scanner;

public class HasEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        findMagicSum(scanner);
    }

    public static boolean hasEight(int number) {
        int hasDigit;
        while (number > 0) {
            hasDigit = number % 10;
            if (hasDigit == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static void findMagicSum(Scanner scanner) {
        int magicSum = 0;
        System.out.print("Enter a positive number (or -1 to end): ");
        int positiveNum = scanner.nextInt();
        if (hasEight(positiveNum)) {
            magicSum += positiveNum;
        }
        boolean stop = false;
        while (!stop) {
            if (positiveNum == -1) {
                stop = true;
                break;
            } else if (positiveNum < 0) {
                System.out.print("Please enter a positive number (or -1 to end): ");
                positiveNum = scanner.nextInt();
            } else {
                System.out.print("Enter a positive number (or -1 to end): ");
                positiveNum = scanner.nextInt();
                if (hasEight(positiveNum)) {
                    magicSum += positiveNum;
                }
            }
        }
        System.out.println("The magic sum is: " + magicSum);
    }
}
