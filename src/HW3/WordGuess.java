package HW3;

import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {

        System.out.println("Java WordGuess");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the keyword");
        String keyWord = scanner.nextLine();

        boolean gameOver = false;
        int count = 1;
        String blank = "";
        for (int i = 0; i < keyWord.length(); i++) {
            blank += "-";
        }
        while (!gameOver) {
            System.out.print("Key in one character or your guess word: ");
            String yourGuess = scanner.nextLine();

            if (yourGuess.length() == 1) {
                char c = yourGuess.charAt(0);
                System.out.print("Trial " + count + ": ");
                boolean flag = true;
                for (int i = 0; i < keyWord.length(); i++) {
                    if (keyWord.charAt(i) == c) {
                        blank = blank.substring(0, i) + c + blank.substring(i + 1, blank.length());
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println("Key word does not contain character \"" + c + "\"");
                } else {
                    System.out.println(blank);
                }
                count++;
            } else if (yourGuess.equals(keyWord)) {
                System.out.println("Congratulation!");
                System.out.println("You got in " + count + " trial");
                gameOver = true;
            } else {
                System.out.println("Your keyword is incorrect!");
                count++;
            }
        }
    }
}
