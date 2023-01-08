package ex18;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyPolynomial myPolynomial = new MyPolynomial(5, 4, 3);
        System.out.println(myPolynomial);

        MyPolynomial givenPolynomial = new MyPolynomial(1, 2, 3, 4);
        System.out.println(givenPolynomial);

        MyPolynomial adding2Polynomial = myPolynomial.add(givenPolynomial);
        System.out.println("- Adding 2 polynomials: " + adding2Polynomial);

        MyPolynomial multi2Polynomial = myPolynomial.multiply(givenPolynomial);
        System.out.println("- Multiplying 2 polynomials: " + multi2Polynomial);

    }
}

