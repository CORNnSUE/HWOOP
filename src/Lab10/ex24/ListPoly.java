package ex24;

import java.util.ArrayList;
import java.util.*;

public class ListPoly extends AbstractPoly {
    List<Double> coefficients;

    public ListPoly(double[] array) {
        coefficients = new ArrayList<>();
        for (double element : array) {
            coefficients.add(element);
        }
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        double[] coef = new double[degree()];
        for (int i = 0; i < degree(); i++) {
            if (coefficients()[i + 1] == 0) {
                coef[i] = 0;
            } else {
                coef[i] = (i + 1) * coefficients.get(i + 1);
            }

        }
        return new ListPoly(coef);
    }

    @Override
    public double[] coefficients() {
        double[] out = new double[coefficients.size()];

        for (int i = 0; i < out.length; i++) {
            out[i] = coefficients.get(i);
        }
        return out;
    }


    @Override
    public double coefficients(int degree) {
        return coefficients.get(degree);
    }
}