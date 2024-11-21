import java.util.Scanner;

public class Trigonometric {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sin(pi/2): ");
        System.out.println(sin((3.14 / 2), 10));

        System.out.println("cos(pi): ");
        System.out.println(cos(3.14, 10));
        double x = 3;
        System.out.println("Cos " + x);
        System.out.println(cos(x,10));
        System.out.println("Sin " + x);
        System.out.println(sin(x, 10));
    }

    public static double sin(double x, int numTerms) {

        double sinx = x;
        double temp = -1.0 * ((x * x * x) / (2.0 * 3.0));

        for (int i = 2; i <= numTerms; i++) {
            sinx += temp;
            temp *= -1.0 * ((x * x) / (2.0 * i * (2.0 * i + 1.0))); //ex if i = 2, 5!/3! = 4*5 = 2i *(2*i +1)
        }

        return sinx;
    }

    public static double cos(double x, int numTerms) {

        double cosx = 1.0;
        double temp = -1.0 * ((x * x) / (1.0 * 2.0));

        for (int i = 2; i <= numTerms; i++) {
            cosx += temp;
            temp *= -1.0 * ((x * x) / (2.0 * i * (2.0 * i - 1.0)));
        }

        return cosx;
    }
}
