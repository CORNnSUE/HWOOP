package Lab2;

import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal string: ");
        String text = scanner.nextLine();
        text = text.toLowerCase();
        boolean flag = true;
        for (int i = 0; i < text.length(); i++) {
            if (!(text.charAt(i) >= '0' && text.charAt(i) <= '9'
                    || text.charAt(i) >= 'a' && text.charAt(i) <= 'f')) {
                flag = false;
                break;
            }
        }
        if (flag) {
            final String[] HEX_BITS = {"0000", "0001", "0010", "0011", "0100", "0101", "0110",
                    "0111", "1000", "1001", "1010", "1011", "1100", "1101",
                    "1110", "1111"};
            System.out.print("The eqivalent binary for hexical " + text + " is: ");
            for (int i = 0; i < text.length(); i++) {
                int numberOfHexical = (int) text.charAt(i) - 48;
                if (text.charAt(i) >= 'a' && text.charAt(i) <= 'f') {
                    numberOfHexical = (int) text.charAt(i) - 87;
                }
                System.out.print(HEX_BITS[numberOfHexical] + " ");
            }
            System.out.println();

        } else {
            System.out.println("\"" + text + "\" is not a hexical String");

        }
    }
}
