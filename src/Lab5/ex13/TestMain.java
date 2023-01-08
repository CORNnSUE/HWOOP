package Lab5.ex13;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle1 = new Rectangle(1.2f, 3.4f);
        System.out.println(rectangle1);

        rectangle1.setLength(7.8f);
        rectangle1.setWidth(5.6f);
        System.out.println(rectangle1);

        System.out.printf("The area is: %.2f%n", rectangle1.getArea());
        System.out.printf("The perimeter is: %.2f%n", rectangle1.getPerimeter());

    }

}
