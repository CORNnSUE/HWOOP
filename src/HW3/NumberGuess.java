import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {
        System.out.println("Java NumberGuess");
        Scanner scanner = new Scanner(System.in);
        int key = (int) (Math.random() * 100);
        int trialTime = 0;

        System.out.println("Key in your guess: ");
        int yourGuess = scanner.nextInt();
        trialTime++;

        while (true) {
            if (yourGuess > key) {
                System.out.println("Try lower");

            } else if (yourGuess < key) {
                System.out.println("Try higher");
            } else {
                trialTime++;
                // isKey = false;
                break;
            }
            yourGuess = scanner.nextInt();
            trialTime++;
        }

        if (trialTime == 1) {
            System.out.println("You got it in 1 trial!");
        } else {
            System.out.println("You got it in " + trialTime + " trials!");
        }
    }
}
