package Lab10.ex24;

public interface Poly {
    public double[] coefficients();
    public double coefficients(int idx);
    public int degree();
    public Poly derivative();
}

