package ex26;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MyPoint Point1 = new MyPoint(3, 4);
        System.out.println(Point1);

        Point1.setX(8);
        Point1.setY(6);

        System.out.println("x = " + Point1.getX());
        System.out.println("y = " + Point1.getY());
        Point1.setXY(3, 0);
        System.out.println(Point1);

        Point1.setX(6);
        Point1.setY(8);

        MyPoint Point2 = new MyPoint(0, 4);
        System.out.println(Point2);


        System.out.println(Point1.distance(Point2));
        System.out.println(Point2.distance(Point1));
        System.out.println(Point1.distance(5, 6));
        System.out.println(Point1.distance());

    }

}
