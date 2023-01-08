package Lab5.ex29;

import java.util.Scanner;

import ex26.MyPoint;

public class TestMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MyTriangle myTriangle = new MyTriangle(new MyPoint(1, 3), new MyPoint(), new MyPoint(4, 5));

        System.out.println(myTriangle);

        System.out.println("Paremeter = " + myTriangle.getParemeter());
        System.out.println("Type = " + myTriangle.getType());

    }
}

