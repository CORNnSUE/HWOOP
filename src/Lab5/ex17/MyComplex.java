package ex17;

public class MyComplex {
        private double real;
        private double imag;
    public MyComplex(){
        this.real = 0.0;
        this.imag = 0.0;
    }
    public MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return this.imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        if (this.imag >= 0) {
            return this.real + " + " + this.imag + "i";
        }
        return this.real + " - " + (-this.imag) + "i";

    }

    public boolean isReal() {
        if (this.imag == 0) {
            return true;
        }
        return false;
    }

    public boolean isImaginary() {
        if (this.real == 0) {
            return true;
        }
        return false;
    }

    public boolean equal(double real, double imag) {
        if (this.real == real && this.imag == imag) {
            return true;
        }
        return false;
    }

    public boolean equal(MyComplex anotherComplex) {
        if (this.real == anotherComplex.getReal() && this.imag == anotherComplex.getImag()) {
            return true;
        }
        return false;
    }

    public double arguments() {
        return Math.atan2(this.imag, this.real);
    }

    public double magnitude() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    public MyComplex addInto(MyComplex addingValue) {
        this.real += addingValue.getReal();
        this.imag += addingValue.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex addingValue) {
        return new MyComplex(this.real + addingValue.getReal(), this.imag + addingValue.getImag());
    }

    public MyComplex subtract(MyComplex subtractingValue) {
        this.real -= subtractingValue.getReal();
        this.imag -= subtractingValue.getImag();
        return this;
    }

    public MyComplex subtractNew(MyComplex subtractingValue) {
        return new MyComplex(this.real - subtractingValue.getReal(), this.imag - subtractingValue.getImag());
    }

    public MyComplex multiply(MyComplex multiplyingValue) {
        double oldReal = this.real;
        this.real *= multiplyingValue.getReal();
        this.real -= this.imag * multiplyingValue.getImag();
        this.imag *= multiplyingValue.getReal();
        this.imag += oldReal * multiplyingValue.getImag();

        return this;
    }

    public MyComplex divde(MyComplex dividingValue) {
        dividingValue.setImag(-dividingValue.getImag());
        multiply(dividingValue);
        this.real /= Math.pow(dividingValue.magnitude(), 2);
        this.imag /= Math.pow(dividingValue.magnitude(), 2);
        return this;
    }

    public MyComplex conjugate() {
        this.imag = -this.imag;
        return this;
    }

}
