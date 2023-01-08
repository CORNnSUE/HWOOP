import java.util.Scanner;

public class NumberSequenceRecursive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 5;
        System.out.print("S(" + number + ") = " + representSequence(5));
        System.out.print("      // length is " + representSequence(5).length());

    }

    public static String representSequence(int number) {

        if (number == 1) {
            return "1";
        }

        return representSequence(number - 1) + String.valueOf(number);
    }

}
