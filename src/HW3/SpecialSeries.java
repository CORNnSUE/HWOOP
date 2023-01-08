package HW3;

public class SpecialSeries {

    public static void main(String[] args) {
        System.out.println(specialSeries(0.3, 3));
        System.out.println(specialSeries(0.4, 3));
        System.out.println(specialSeries(0.5, 3));
        System.out.println(specialSeries(0.6, 3));
    }

    public static double specialSeries(double x, int numTerm) {

        if (x > 1 || x < -1) {
            return -1.0;
        }

        double result = x ;
        double temp1 = 0.5 ;
        double temp2 =  (x * x * x) / 3.0 ;

        for (int i = 2; i <= numTerm; i++) {
            result += (temp1 * temp2);
            temp1 *= ((2*i - 1)/(2*i));
            temp2 *= (((x*x) * (2*i -1 ))/ (2*i+1));
        }

        return result;

    }

}
