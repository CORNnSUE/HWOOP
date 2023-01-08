package ex28;

import java.util.Scanner;

import ex26.MyPoint;

public class TestMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MyCircle myCircle = new MyCircle(new MyPoint(2, 1), 5);

        System.out.println(myCircle);

        System.out.println("x = " + myCircle.getCenterX());
        System.out.println("y = " + myCircle.getCenterX());
        System.out.println("radius = " + myCircle.getRadius());

        System.out.println("x = " + myCircle.getCenterXY()[0] + ", y = " + myCircle.getCenterXY()[1]);
        System.out.println("Area = " + myCircle.getArea());
        System.out.println("Distance with (0, 0): " + myCircle.getDistance(new MyCircle()));

        myCircle.setCenter(new MyPoint(1, 1));
        System.out.println(myCircle);
        myCircle.setCenterX(10);
        myCircle.setCenterY(4);
        System.out.println(myCircle);
        myCircle.setCenterXY(5, 6);
        System.out.println(myCircle);
        myCircle.setRadius(10);
        System.out.println(myCircle);

    }
}

