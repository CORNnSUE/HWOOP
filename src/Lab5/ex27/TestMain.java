package ex27;

import ex26.MyPoint;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MyPoint myPoint[] = new MyPoint[6];

        for (int i = 0; i < myPoint.length; i++) {
            myPoint[i] = new MyPoint(i, i);
        }

        MyLine myLine[] = new MyLine[2];

        for (int i = 0; i < myLine.length; i++) {
            myLine[i] = new MyLine(myPoint[i], myPoint[i + 1]);
        }

        int count = 1;
        for (MyLine item : myLine) {
            System.out.println("Line number " + count + "\n");
            System.out.println("-Point begin: " + item.getBegin());
            System.out.println("-X begin: " + item.getBeginX());
            System.out.println("-Y begin: " + item.getBeginY());

            System.out.println("-Point end: " + item.getEnd());
            System.out.println("-X end: " + item.getEndX());
            System.out.println("-Y end " + item.getEndY());

            System.out.println("-Gradient: " + item.getGradient());
            System.out.println("-Length: " + item.getLength());
            System.out.println();
            count++;

        }

    }

}

