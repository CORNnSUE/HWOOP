package Lab7.ex11;

public class TestMain {
    public static void main(String[] args) {

        Shape shape1 = new Circle(5.5, "red", false); //upcast circle to shape

        System.out.println(shape1);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getColor());
        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.isFilled());
        System.out.println("\n");

        Circle circle1 = (Circle) shape1; //downcast back to circle
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getColor());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.isFilled());
        System.out.println("\n");


        Shape shape3 = new Rectangle(4.5, 4.0, "red", false); //upcast

        System.out.println(shape3);
        System.out.println(shape3.getArea());
        System.out.println(shape3.getColor());
        System.out.println(shape3.getPerimeter());
        System.out.println(shape3.isFilled());
        System.out.println("\n");


        Rectangle square1 = (Rectangle)shape3; //downcast
        System.out.println(square1);
        System.out.println(square1.getArea());
        System.out.println(square1.getColor());
        System.out.println(square1.getLength());
        System.out.println("\n");


        Rectangle shape4 = new Square(6.6);

        System.out.println(shape4);
        System.out.println(shape4.getArea());
        System.out.println(shape4.getColor());
        System.out.println(shape4.getPerimeter());
        System.out.println(shape4.isFilled());
        System.out.println("\n");


        //downcast Shape shape4 to rectangle
        //which is a superclass of Square, instead of Square

        Rectangle rectangle2 = (Rectangle) shape4;
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getColor());
        System.out.println(rectangle2.getLength());
        System.out.println("\n");

        //error
        // System.out.println(rectangle2.getSide());***

        //downcast form Rectangle rectangle2 to square
        /*
        Square square1 = (Square) rectangle2; ***
        System.out.println(square1);
        System.out.println(square1.getArea());
        System.out.println(square1.getColor());
        System.out.println(square1.getSide());
        System.out.println(square1.getLength());
        */
    }

}
