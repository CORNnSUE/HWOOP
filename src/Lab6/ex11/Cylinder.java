package Lab6.ex11;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this(1.0);
    }

    public Cylinder(double radius) {
        this(1.0, radius);
    }

    public Cylinder(double height, double radius) {
        this(height, radius, "red");
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumn() {
        return this.height * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder: [ " + super.toString() + " ], height = " + this.height + "]";
    }
}

