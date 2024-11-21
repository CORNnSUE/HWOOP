package Lab7.ex18;

public class TestMain {
    public static void main(String[] args) {

        Movable movable = new MovablePoint(2, 2, 1, 1);
        System.out.println("Point1: " + movable);

        movable.moveUp();
        System.out.println("Up: " + movable);

        movable.moveDown();
        System.out.println("Down: " + movable);

        movable.moveLeft();
        System.out.println("Left: " + movable);

        movable.moveRight();
        System.out.println("Right" + movable);

        Movable movable2 = new MovableCircle(2, 2, 1, 1, 1);
        System.out.println("Circle1: " + movable2);

        movable2.moveUp();
        System.out.println("Up: " + movable2);

        movable2.moveDown();
        System.out.println("Down: " + movable2);

        movable2.moveLeft();
        System.out.println("Left: " + movable2);

        movable2.moveRight();
        System.out.println("Right: " + movable2);

        Movable movable3 = new MovableRectangle(1,1,2,2,1,1);
        System.out.println("Rectangle: " + movable3);

        movable3.moveUp();
        System.out.println("Up: " + movable3);

        movable3.moveDown();
        System.out.println("Down: " + movable3);

        movable3.moveLeft();
        System.out.println("Left: " + movable3);

        movable3.moveRight();
        System.out.println("Right: " + movable3);

    }
}
