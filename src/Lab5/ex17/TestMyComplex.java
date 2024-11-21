package Lab5.ex17;
import java.util.Scanner;

public class TestMyComplex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyComplex myComplex = new MyComplex(3, 4);
        System.out.println(myComplex);

        // Check getValue:
        System.out.println("The real is: " + myComplex.getReal());
        System.out.println("The imaginary is: " + myComplex.getImag());

        // Check setValue:
        myComplex.setReal(6);
        myComplex.setImag(8);
        System.out.println(myComplex);

        myComplex.setValue(5, 4);
        System.out.println(myComplex);

        // Check boolean type methods
        System.out.println(myComplex.isReal());
        System.out.println(myComplex.isImaginary());
        System.out.println(new MyComplex(4, 0).isReal());
        System.out.println(new MyComplex(0, 1).isImaginary());
        System.out.println(myComplex.equal(5, 4));
        System.out.println(myComplex.equal(new MyComplex(0, 2)));

        // Check argument, magnitude
        System.out.printf("The argument is: %.2f (rad) %n", myComplex.arguments());
        System.out.printf("The magnitude is: %.2f%n", myComplex.magnitude());

        // Check "myComplex" type methods
        // Modify the current instance
        MyComplex anotherComplex = new MyComplex(3, 4);
        myComplex.addInto(anotherComplex);
        System.out.println(myComplex);
        myComplex.subtract(anotherComplex);
        System.out.println(myComplex);
        myComplex.multiply(anotherComplex);
        System.out.println(myComplex);
        myComplex.divde(anotherComplex);
        System.out.println(myComplex);
        myComplex.conjugate();
        System.out.println(myComplex);

        // Creat a new instace but not modify the current instance
        MyComplex complex1 = myComplex.addNew(myComplex);
        System.out.println(complex1 + "\n" + myComplex);
        MyComplex complex2 = myComplex.subtractNew(myComplex);
        System.out.println(complex2 + "\n" + myComplex);


    }

}