package Lab10.ex24;

public abstract class AbstractPoly implements Poly {
    public AbstractPoly() {

    }

    double[] derive() {
        return null;
    }

    public boolean equals(Object o) {
        if (o instanceof AbstractPoly) {
            AbstractPoly another = (AbstractPoly) o;
            if (this.coefficients().equals(another.coefficients()) &&
                    this.degree() == another.degree()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return degree();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
