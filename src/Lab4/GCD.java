import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("GCD of (15, 5), (99, 88):");
        System.out.println(gcd(10, 5));
        System.out.println(gcd(99, 88));

    }

    public static int gcd(int num1, int num2) {
        if (num1 > num2) {
            return GCDposition(num1, num2);
        }
        return GCDposition(num2, num1);
    }

    private static int GCDposition(int biggerNum, int smallerNum) {
        while (smallerNum != 0) {
            int temp = smallerNum;
            smallerNum = biggerNum % smallerNum;
            biggerNum = temp;
        }
        return biggerNum;
    }

}
