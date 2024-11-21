package HW6.ex14;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);
        for (int i = 0; i < 3; i++) {
            ball.move();
            box.collides(ball);
            System.out.println(ball);
        }

    }
}

