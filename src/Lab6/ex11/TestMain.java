package Lab6.ex11;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cylinder cylinder = new Cylinder(2, 2, "blue");

        System.out.println(cylinder);

        cylinder.setColor("black");
        cylinder.setHeight(5.5);
        cylinder.setRadius(10.0);

        System.out.println(cylinder);

        System.out.println("area = " + cylinder.getArea());
        System.out.println("radius = " + cylinder.getRadius());
        System.out.println("volumn = " + cylinder.getVolumn());
        System.out.println("height = " + cylinder.getHeight());
        System.out.println("color = " + cylinder.getColor());


    }

}
