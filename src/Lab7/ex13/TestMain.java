package Lab7.ex13;

public class TestMain {
    public static void main(String[] args) {

        Movable movable = new MovablePoint(2, 2, 1, 1) ;

        System.out.println(movable);

        movable.moveDown();
        System.out.println(movable);

        movable.moveUp();
        System.out.println(movable);

        movable.moveLeft();
        System.out.println(movable);

        movable.moveRight();
        System.out.println(movable);

    }
}

