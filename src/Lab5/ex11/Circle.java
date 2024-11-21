package Lab5.ex11;

public class Circle {
    private double radius;
    private String color;

    public Circle() { // default constructor
        radius = 1.0;
        color = "red";

    }

    public Circle(double r) { //constructor
        radius = r;
        color = "red";
    }

    public double getRadius() { //getter
        return radius;
    }


    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[" + getRadius() + ", " + getArea() + "]";
    }
}