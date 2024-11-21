package Lab7.ex12;

public class TestMain {
    public static void main(String[] args) {

        GeometricObject geometricObject = new Circle(1);

        System.out.println(geometricObject);
        System.out.println("Circle's area: " + geometricObject.getArea());
        System.out.println("Circle's perimeter: " + geometricObject.getPerimeter());


        GeometricObject geometricObject2 = new Rectangle(1, 1);

        System.out.println(geometricObject2);
        System.out.println("Rectangle's area: " + geometricObject2.getArea());
        System.out.println("Rectangle's perimeter: " + geometricObject2.getPerimeter());

    }

}

