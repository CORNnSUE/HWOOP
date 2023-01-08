package Lab7.ex15;

public class TestMain {
    public static void main(String[] args) {

        GeometricObject circle = new Circle(1);

        System.out.println(circle);
        System.out.println("Circle's area: "+circle.getArea());
        System.out.println("Circle's perimeter: " + circle.getPerimeter());
        System.out.println("\n");

        ResizableCircle resizableCircle = new ResizableCircle(10);

        System.out.println(resizableCircle);
        System.out.println("ResizableCircle's area: " +resizableCircle.getArea());
        System.out.println("ResizableCircle's perimeter: " + resizableCircle.getPerimeter());
        System.out.println("\n");

        resizableCircle.resize(10); //radius = 10%radius

        System.out.println(resizableCircle);
        System.out.println("ResizableCircle's area: " +resizableCircle.getArea());
        System.out.println("ResizableCircle's perimeter: " + resizableCircle.getPerimeter());

    }
}
