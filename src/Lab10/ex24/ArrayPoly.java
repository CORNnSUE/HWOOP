package Lab10.ex24;

public class ArrayPoly extends AbstractPoly {
    private final double[] coefficients;

    public ArrayPoly(double[] array) {
        coefficients = array;
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }



    @Override
    public Poly derivative() {
        return null;
    }
    @Override
    public double coefficients(int idx) {
        return coefficients[idx];
    }
    @Override
    public double[] coefficients() {return coefficients;
    }
}